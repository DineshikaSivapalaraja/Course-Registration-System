package com.backend.CourseRegistrationBackend.service;

import com.backend.CourseRegistrationBackend.model.Course;
import com.backend.CourseRegistrationBackend.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }
}
