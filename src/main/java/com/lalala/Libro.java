package com.lalala;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    // Método para actualizar número de páginas
    public void actualizarPaginas(int nuevasPaginas) {
        if (nuevasPaginas > 0) {
            this.numeroPaginas = nuevasPaginas;
            System.out.println("Número de páginas actualizado a: " + numeroPaginas);
        } else {
            System.out.println("Error: El número de páginas debe ser mayor que cero.");
        }
    }
}