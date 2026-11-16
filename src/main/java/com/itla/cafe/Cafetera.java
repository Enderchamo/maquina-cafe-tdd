package com.itla.cafe;

public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe) {
        if (cantidadCafe < 0)
            throw new IllegalArgumentException("Cafe invalido");
        this.cantidadCafe = cantidadCafe;
    }

    public boolean hasCafe(int cantidad) {
        return cantidad >= 0 && cantidadCafe >= cantidad;
    }

    public void giveCafe(int cantidad) {
        if (cantidad < 0 || !hasCafe(cantidad))
            throw new IllegalArgumentException("Cafe insuficiente");
        cantidadCafe -= cantidad;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }
}
