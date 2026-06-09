package com.hsan.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")


public class StudentController {

   @GetMapping
   
   
   
   
     public List<Student> findAllStudents() {
    return List.of(
        new Student(34, LocalDate.now(), "hsansmida02@gmail.com", "hsan", "smida"),
        new Student(33, LocalDate.now(), "hsan02@gmail.com", "cyrine", "bcl")
    );

    
}
}
