package com.backend.CourseRegistrationBackend.service;

import com.backend.CourseRegistrationBackend.model.Course;
import com.backend.CourseRegistrationBackend.model.CourseRegistry;
import com.backend.CourseRegistrationBackend.repository.CourseRegistryRepo;
import com.backend.CourseRegistrationBackend.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
