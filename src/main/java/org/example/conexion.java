package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String URL = "jdbc:mysql://ucmz8nvgtzx1jydz:vN8hLlajWSTKvzwxfy66@bxnknwo9rvftkuqw84n2-mysql.services.clever-cloud.com:3306/bxnknwo9rvftkuqw84n2";
    private static final String USER = "ucmz8nvgtzx1jydz";
    private static final String PASSWORD = "vN8hLlajWSTKvzwxfy66";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
