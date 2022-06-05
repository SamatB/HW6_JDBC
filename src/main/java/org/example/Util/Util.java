package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:postgresql://localhost:5432/home_work6";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "user";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
