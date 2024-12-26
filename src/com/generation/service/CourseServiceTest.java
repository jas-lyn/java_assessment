package com.generation.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;
import com.generation.service.CourseService;

import java.util.Date;

class CourseServiceTest {

    CourseService courseService;
    Student testStudent;
    Course testCourse;

    @BeforeEach
    void setUp() {
        courseService = new CourseService();
        testStudent = new Student("S001", "John Doe", "john.doe@example.com", new Date());
        testCourse = new Course("C001", "Java Programming", 9, new Module("MOD001", "Module Name", "Module Description"));
    }

    @Test
    void testRegisterCourse() {
        Course newCourse = new Course("C002", "Python Programming", 9, new Module("MOD002", "Module Python", "Python Basics"));

        courseService.registerCourse(newCourse);

        assertNotNull(courseService.getCourse("C002"), "The course should be registered.");
    }

    @Test
    void testGetCourse() {
        Course retrievedCourse = courseService.getCourse("INTRO-CS-1");

        // Assert
        assertNotNull(retrievedCourse, "The course should be found.");
    }


}
