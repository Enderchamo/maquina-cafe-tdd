package com.itla.cafe;

public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        if (cantidadAzucar < 0)
            throw new IllegalArgumentException("Azucar invalida");
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasAzucar(int cantidad) {
        return cantidad >= 0 && cantidadAzucar >= cantidad;
    }

    public void giveAzucar(int cantidad) {
        if (cantidad < 0 || !hasAzucar(cantidad))
            throw new IllegalArgumentException("Azucar insuficiente");
        cantidadAzucar -= cantidad;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }
}
