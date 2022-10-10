package com.example.mysqlproject.controller;

import com.example.mysqlproject.repository.DatabaseConnectionManager;

public class Main {

    public static void main(String[] args) {
        DatabaseConnectionManager.getConnection();

    }
}
