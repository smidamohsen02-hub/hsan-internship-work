package com.hsan.demo.student;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dateofbirth;
    private int age ;
    private String email;
    

    public Student(int age, LocalDate dateofbirth, String email, String firstname, String lastname) {
        this.age = age;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Student() {
    }
    
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public LocalDate getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    


    
}
