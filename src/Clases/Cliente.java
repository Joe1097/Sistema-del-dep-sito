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
public class Cliente {
    private int numero_cliente;
    private int numero_producto;
    private int cantidad;
    private float importe;
    private String fecha;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumeroCliente() {
        return numero_cliente;
    }

    public void setNumeroCliente(int numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public int getNumeroProducto() {
        return numero_producto;
    }

    public void setNumeroProducto(int numero_producto) {
        this.numero_producto = numero_producto;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente(int numero_venta, int numero_producto, int cantidad, float importe, String fecha) {
        this.numero_cliente = numero_venta;
        this.numero_producto = numero_producto;
        this.cantidad = cantidad;
        this.importe = importe;
        this.fecha = fecha;
    }
    
}
