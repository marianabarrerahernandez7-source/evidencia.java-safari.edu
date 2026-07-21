package com.safariedu.util;

import java.util.Scanner;

public class consola {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printBanner() {
        System.out.println("""
                
                ================================================
                🦒 SAFARI.EDU - Aprendizaje Divertido con Animalitos 🦁
                ================================================
                """);
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor ingresa solo números.");
            }
        }
    }
}