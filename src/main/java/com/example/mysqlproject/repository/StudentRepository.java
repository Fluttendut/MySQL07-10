package com.example.mysqlproject.repository;

import com.example.mysqlproject.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private Connection conn = DatabaseConnectionManager.getConnection();

    public List<Student> getAlStudents(){
        List<Student> student = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM Student");
            ResultSet resultSet = psts.executeQuery();

                while (resultSet.next()){
                    student.add(new Student(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("email"),
                            resultSet.getBoolean("gender")
                            ));


                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return student;
    }
}
