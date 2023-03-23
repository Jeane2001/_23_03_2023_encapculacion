package com.adecco.presentacion;


import com.adecco.modelo.Producto;

public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto();

        producto1.setNumProducto(100);
        producto1.setNombreProducto("sina");

        System.out.println(producto1.getNumProducto());
        System.out.println(producto1.getNombreProducto());

    }

}


