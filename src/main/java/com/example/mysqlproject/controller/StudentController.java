package com.example.mysqlproject.controller;

import com.example.mysqlproject.model.Student;
import com.example.mysqlproject.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentService service = new StudentService();

    @GetMapping("/")
    public List<Student> index(){
        return service.getAlStudents();
    }

    @GetMapping("student")
    public Student getStudent(@RequestParam int id){
        return service.getStudent(id);
    }

}
