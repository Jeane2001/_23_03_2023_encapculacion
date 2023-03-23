package com.adecco.modelo;

public class Producto {
    //1.atributos
    private int numProducto;
    private String nombreProducto;
    private double precio;
    //2.metodo
    //3.constructores
    //Setters y Getters
    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }
    public void setNombreProducto(String nombre) {
        this.nombreProducto = nombre;
    }
    public int getNumProducto() {
        return  this.numProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }
}




