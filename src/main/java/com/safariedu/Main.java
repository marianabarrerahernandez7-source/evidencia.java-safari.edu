package com.safariedu;

import com.safariedu.dao.UsuarioDAO; // UsuarioDAO con U y DAO
import com.safariedu.modelo.Usuario;  // Usuario con U
import com.safariedu.util.consola;

public class Main {
    public static void main(String[] args) {
        consola.printBanner();

        System.out.println("¡Bienvenido a Safari.Edu! \n");

        String nombre = consola.leerTexto("👤 Ingresa tu nombre: ");
        int edad = consola.leerEntero("🎂 Ingresa tu edad: ");
        String animal = consola.leerTexto("🐘 Animal favorito: ");

        Usuario nuevoUsuario = new Usuario(nombre, edad, animal); // Usuario con U
        UsuarioDAO dao = new UsuarioDAO(); // UsuarioDAO con U

        if (dao.registrar(nuevoUsuario)) {
            System.out.println("\n✅ ¡Registro exitoso! Bienvenid@ " + nombre + " a Safari.Edu");
            System.out.println("Tu animal favorito es: " + animal);
        } else {
            System.out.println("\n❌ Hubo un problema al guardar tu registro.");
        }
    }
}