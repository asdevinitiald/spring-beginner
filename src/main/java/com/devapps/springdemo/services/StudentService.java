package com.devapps.springdemo.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devapps.springdemo.models.Student;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("firstname1", "lastname1", LocalDate.now(), "student1@gmail.com", 33),
                new Student("firstname2", "lastname2", LocalDate.now(), "student1@gmail.com", 33),
                new Student("firstname3", "lastname3", LocalDate.now(), "student1@gmail.com", 33),
                new Student("firstname4", "lastname4", LocalDate.now(), "student1@gmail.com", 33));
    }
}
