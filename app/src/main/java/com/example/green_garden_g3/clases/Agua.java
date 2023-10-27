package com.example.green_garden_g3.clases;

public class Agua extends Categoria {
    public Agua(String nombre, int costo, String unidad) {
        super(nombre, costo, unidad);
    }

    @Override
    public double costoConsumo(double cantidad) {
        System.out.println("Calculando consumo de agua");
        return costo * cantidad;
    }
}
