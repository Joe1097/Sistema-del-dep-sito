/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 * 
 * @author José Manuel Carrillo Torres
 */
public class Producto {
    private int numero;
    private String nombre;
    private String contenido;
    private String linea;
    private int existencia;
    private Double precio;

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public String getLinea() {
        return linea;
    }

    public int getExistencia() {
        return existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    } 

    public Producto(int numero, String nombre, String contenido, String linea, int existencia, Double precio) {
        this.numero = numero;
        this.nombre = nombre;
        this.contenido = contenido;
        this.linea = linea;
        this.existencia = existencia;
        this.precio=precio;
    }
     
}
