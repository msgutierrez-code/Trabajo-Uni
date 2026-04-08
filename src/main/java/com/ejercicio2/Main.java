package com.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Temperatura con 20 °C
        Temperatura temp = new Temperatura(20.0);

        // Mostrar temperatura inicial
        System.out.println("Temperatura inicial:");
        temp.mostrarTemperatura();

        // Aumentar la temperatura
        System.out.println("\nAumentando 10 °C:");
        temp.aumentar(10.0);

        // Disminuir la temperatura
        System.out.println("\nDisminuyendo 5 °C:");
        temp.disminuir(5.0);

        // Intentar disminuir por debajo del cero absoluto
        System.out.println("\nIntentando disminuir 300 °C (por debajo del cero absoluto):");
        temp.disminuir(300.0);

        // Mostrar temperatura final
        System.out.println("\nTemperatura final:");
        temp.mostrarTemperatura();
    }
}