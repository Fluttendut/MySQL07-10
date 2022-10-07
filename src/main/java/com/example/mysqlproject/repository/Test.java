package com.example.mysqlproject.repository;

public class Test {

    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();

        System.out.println(repo.getAlStudents());
    }
}
