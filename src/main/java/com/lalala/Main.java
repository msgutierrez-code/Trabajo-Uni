package com.lalala;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Libro
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1000);

        // Mostrar información inicial
        System.out.println("Información inicial del libro:");
        libro.mostrarInformacion();

        // Modificar el número de páginas con un valor válido
        System.out.println("\nActualizando páginas a 1200:");
        libro.actualizarPaginas(1200);

        // Mostrar información después de la actualización
        System.out.println("\nInformación después de la actualización:");
        libro.mostrarInformacion();

        // Intentar asignar un valor inválido
        System.out.println("\nIntentando actualizar páginas a -50:");
        libro.actualizarPaginas(-50);

        // Mostrar información final
        System.out.println("\nInformación final del libro:");
        libro.mostrarInformacion();
    }
}