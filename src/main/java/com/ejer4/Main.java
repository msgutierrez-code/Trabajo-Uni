package com.ejer4;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", "Camry");

        // Mostrar estado inicial
        System.out.println("Estado inicial:");
        vehiculo.mostrarEstado();

        // Aumentar velocidad
        System.out.println("\nAumentando velocidad en 50 km/h:");
        vehiculo.aumentarVelocidad(50);

        // Mostrar estado
        System.out.println("\nEstado actual:");
        vehiculo.mostrarEstado();

        // Aumentar más velocidad
        System.out.println("\nAumentando velocidad en 100 km/h:");
        vehiculo.aumentarVelocidad(100);

        // Mostrar estado
        System.out.println("\nEstado actual:");
        vehiculo.mostrarEstado();

        // Intentar aumentar velocidad por encima del límite
        System.out.println("\nIntentando aumentar velocidad en 200 km/h (excedería el límite):");
        vehiculo.aumentarVelocidad(200);

        // Mostrar estado
        System.out.println("\nEstado actual:");
        vehiculo.mostrarEstado();

        // Reducir velocidad
        System.out.println("\nReduciendo velocidad en 80 km/h:");
        vehiculo.reducirVelocidad(80);

        // Mostrar estado
        System.out.println("\nEstado actual:");
        vehiculo.mostrarEstado();

        // Intentar reducir velocidad por debajo de cero
        System.out.println("\nIntentando reducir velocidad en 200 km/h (sería negativa):");
        vehiculo.reducirVelocidad(200);

        // Mostrar estado final
        System.out.println("\nEstado final:");
        vehiculo.mostrarEstado();
    }
}