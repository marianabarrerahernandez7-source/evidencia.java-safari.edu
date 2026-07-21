package com.safariedu.dao; // ESTO FALTABA

import com.safariedu.modelo.Usuario; // ESTO FALTABA
import java.sql.Connection; // ESTO FALTABA
import java.sql.PreparedStatement; // ESTO FALTABA
import java.sql.SQLException; // ESTO FALTABA

public class UsuarioDAO { // con minuscula porque así se llama tu archivo

    public boolean registrar(Usuario usuario) { // Usuario con mayúscula
        String sql = "INSERT INTO usuarios (nombre, edad, animal_favorito) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexion.obtenerConexion(); // Conexion con C mayúscula
             PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setString(1, usuario.getNombre());
            ps.setInt(2, usuario.getEdad());
            ps.setString(3, usuario.getAnimalFavorito());

            int filas = ps.executeUpdate();
            return filas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}