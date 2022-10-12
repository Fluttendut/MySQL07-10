package com.example.mysqlproject.service;

import com.example.mysqlproject.model.Student;
import com.example.mysqlproject.repository.StudentRepository;

import java.util.List;

public class StudentService {
    StudentRepository repo = new StudentRepository();

    public List<Student> getAlStudents(){
        return repo.getAlStudents();
    }

    public Student getStudent(int id){
        return repo.getStudent(id);
    }
}
