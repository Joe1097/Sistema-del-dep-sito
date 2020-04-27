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
public class Proveedor {
    private int id;
    private String nombre;
    private long telefono;
    private String calle;
    private int numero;
    private int interior;
    private String colonia;
    private int cp;
    private String municipio;
    private String estado;

    public Proveedor(int a, String b, long c, String d, int e, String f, String g, int h, String j, String k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getInterior() {
        return interior;
    }

    public void setInterior(int interior) {
        this.interior = interior;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proveedor(int id, String nombre, long telefono, String calle, int numero, int interior, String colonia, int cp, String municipio, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.numero = numero;
        this.interior = interior;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipio;
        this.estado = estado;
    }  
           
}
