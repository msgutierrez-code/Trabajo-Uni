package com.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto Producto
        Producto producto = new Producto("Laptop", 1500.00, 10);

        // Mostrar información inicial
        System.out.println("Información inicial del producto:");
        producto.mostrarInformacion();

        // Modificar el precio con un valor válido
        System.out.println("\nActualizando precio a $1200.00:");
        producto.asignarPrecio(1200.00);

        // Mostrar información después de la actualización
        System.out.println("\nInformación después de la actualización:");
        producto.mostrarInformacion();

        // Intentar asignar un precio negativo
        System.out.println("\nIntentando asignar precio negativo (-500.00):");
        producto.asignarPrecio(-500.00);

        // Mostrar información final
        System.out.println("\nInformación final del producto:");
        producto.mostrarInformacion();
    }
}