package com.ejercicio2;

public class Temperatura {
    private double temperatura; // en grados Celsius

    // Constructor
    public Temperatura(double temperaturaInicial) {
        this.temperatura = temperaturaInicial;
    }

    // Método para aumentar la temperatura
    public void aumentar(double cantidad) {
        this.temperatura += cantidad;
        System.out.println("Temperatura aumentada en " + cantidad + " °C. Nueva temperatura: " + temperatura + " °C");
    }

    // Método para disminuir la temperatura
    public void disminuir(double cantidad) {
        double nuevaTemperatura = this.temperatura - cantidad;
        if (nuevaTemperatura >= -273.15) {
            this.temperatura = nuevaTemperatura;
            System.out.println("Temperatura disminuida en " + cantidad + " °C. Nueva temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Error: No se puede disminuir la temperatura por debajo del cero absoluto (-273.15 °C). Temperatura actual: " + temperatura + " °C");
        }
    }

    // Método para mostrar la temperatura actual
    public void mostrarTemperatura() {
        System.out.println("Temperatura actual: " + temperatura + " °C");
    }
}