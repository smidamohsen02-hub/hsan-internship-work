package com.hsan.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
      public List<Student> findAllStudents() {
    return List.of(
        new Student(34, LocalDate.now(), "hsansmida02@gmail.com", "hsan", "smida"),
        new Student(33, LocalDate.now(), "hsan02@gmail.com", "cyrine", "bcl")
    );

    
}
    
}
