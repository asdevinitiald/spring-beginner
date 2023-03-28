package com.devapps.springdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devapps.springdemo.models.Student;
import com.devapps.springdemo.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }
}
