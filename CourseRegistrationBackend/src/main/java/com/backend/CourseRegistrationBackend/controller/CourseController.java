package com.backend.CourseRegistrationBackend.controller;

import com.backend.CourseRegistrationBackend.model.Course;
import com.backend.CourseRegistrationBackend.model.CourseRegistry;
import com.backend.CourseRegistrationBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    //get available courses
    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();

    }

    //get enrolled students for courses
    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    //register to courses
    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulation "+name+" ! Successfully enrolled for "+courseName+" course";
    }

}
