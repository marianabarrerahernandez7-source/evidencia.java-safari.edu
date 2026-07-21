package com.safariedu.dao; // ESTA LÍNEA ES CLAVE

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/safariedu";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}