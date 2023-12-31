package com.springboot.learning.springboot.restapi.controller;

import com.springboot.learning.springboot.restapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // GET Rest api returning a bean as a json
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {
        return new Student(100, "Raju");
    }

    // GET Rest api returning a list of beans as json
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100, "Raju"));
        students.add(new Student(101, "Harika"));
        students.add(new Student(103, "Hanvika"));
        return students;
    }

    // Rest api with path variable
    // id -> URI template variable
    // http://localhost:8080/students/1/hanvika
    @GetMapping("students/{id}/{name}")
    public Student getStudentWithPathVariable(@PathVariable int id,
                                              @PathVariable("name") String studentName) {
        return new Student(id, studentName);
    }
}
