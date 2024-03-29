package com.example.springbootcourseapi.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcourseapi.models.Course;

@RestController
public class CouseController {
    
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course (1, "Learn AWS", "in28minutes"),
            new Course (2, "Learn DevOps", "in28minutes"),
            new Course (3, "Learn Java", "in28minutes"),
            new Course (4, "Learn DevOps", "in28minutes")
        );
    }
}
