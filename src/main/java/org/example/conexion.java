package org.example;

import java.sql.*;

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

    public static boolean verificarCredenciales (String usuario, String contra, String rol) {
        boolean esValido = false;

        String query = "SELECT * FROM usuarios WHERE nombre_usuario  = ? AND password = ? AND rol = ?";

        // Uso de try-with-resources para garantizar el cierre de los recursos
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usuario);
            stmt.setString(2, contra);
            stmt.setString(3, rol);

            ResultSet rs = stmt.executeQuery();

            // Si el resultado tiene una fila, las credenciales son válidas
            if (rs.next()) {
                esValido = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return esValido;
    }
}

