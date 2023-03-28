package com.devapps.springdemo.student;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }


    @GetMapping
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email")  String email){
        studentService.delete(email);
    }
}
