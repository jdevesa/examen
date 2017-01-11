/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author pepe
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int any;
    private double precio;
    private Editorial editorial;

    public Libro(String isbn, String titulo, int any, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.any = any;
        this.precio = precio;
    }
    public void perteneceA(Editorial ed){
        this.editorial=ed;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAny() {
        return any;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "isbn=\t\t" + isbn + "\ntitulo=\t\t" + titulo + "\nany=\t\t" + any + "\nprecio=\t\t" + precio + "\neditorial=\t" + editorial;
    }

   
    
             
}
