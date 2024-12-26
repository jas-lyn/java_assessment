package com.generation.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.generation.model.Course;
import com.generation.model.Student;
import com.generation.service.StudentService;

import java.util.Date;

public class StudentServiceTest {

    private StudentService studentService;
    private Student testStudent;
    private Course testCourse;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        testStudent = new Student("S001", "John Doe", "john.doe@example.com", new Date());
    }

    @Test
    @DisplayName("Tests for testSubscribeStudent has passed")
    void testSubscribeStudent() {
        studentService.subscribeStudent(testStudent);

        assertTrue(studentService.isSubscribed("S001"), "The student should be subscribed.");
    }

    @Test
    @DisplayName("Tests for testIsSubscribed has passed")

    void testIsSubscribed() {
        studentService.subscribeStudent(testStudent);

        assertTrue(studentService.isSubscribed("S001"), "The student should be subscribed.");
        assertFalse(studentService.isSubscribed("S002"), "A non-existent student should not be subscribed.");
    }

}
