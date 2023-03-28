package com.devapps.springdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<String> findAllStudents(){
        return List.of("Student 1","Cek!");
    }
}
