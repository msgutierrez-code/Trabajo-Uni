package com.ejer4;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double velocidad;
    private final double VELOCIDAD_MAXIMA = 300.0; // km/h

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0.0;
    }

    // Método para aumentar velocidad
    public void aumentarVelocidad(double cantidad) {
        double nuevaVelocidad = this.velocidad + cantidad;
        if (nuevaVelocidad <= VELOCIDAD_MAXIMA) {
            this.velocidad = nuevaVelocidad;
            System.out.println("Velocidad aumentada en " + cantidad + " km/h. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("Error: No se puede exceder la velocidad máxima de " + VELOCIDAD_MAXIMA + " km/h. Velocidad actual: " + velocidad + " km/h");
        }
    }

    // Método para reducir velocidad
    public void reducirVelocidad(double cantidad) {
        double nuevaVelocidad = this.velocidad - cantidad;
        if (nuevaVelocidad >= 0) {
            this.velocidad = nuevaVelocidad;
            System.out.println("Velocidad reducida en " + cantidad + " km/h. Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("Error: La velocidad no puede ser negativa. Velocidad actual: " + velocidad + " km/h");
        }
    }

    // Método para mostrar estado del vehículo
    public void mostrarEstado() {
        System.out.println("--- Estado del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Velocidad Máxima: " + VELOCIDAD_MAXIMA + " km/h");
    }
}