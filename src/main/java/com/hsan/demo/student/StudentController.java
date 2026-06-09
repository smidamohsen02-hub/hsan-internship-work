package com.hsan.demo.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")


public class StudentController {
    private StudentService Service;
public StudentController(StudentService Service) {
    this.Service = Service;
}

   @GetMapping
   
   
   
   
     public List<Student> findAllStudents() {
    return Service.findAllStudents();
       

    
}
}
