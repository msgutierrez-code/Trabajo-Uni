package com.ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método para asignar nuevo precio
    public void asignarPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
            System.out.println("Precio actualizado a: $" + precio);
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Método para mostrar información completa
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
    }
}