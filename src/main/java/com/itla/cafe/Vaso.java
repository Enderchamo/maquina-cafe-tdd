package com.itla.cafe;

public class Vaso {
    private final int contenido;
    private int cantidadVasos;

    public Vaso(int contenido, int cantidadVasos) {
        if (contenido <= 0 || cantidadVasos < 0)
            throw new IllegalArgumentException("Valores invalidos");
        this.contenido = contenido;
        this.cantidadVasos = cantidadVasos;
    }

    public boolean hasVasos(int cantidad) {
        return cantidad >= 0 && cantidadVasos >= cantidad;
    }

    public void giveVasos(int cantidad) {
        if (cantidad < 0 || !hasVasos(cantidad))
            throw new IllegalArgumentException("Vasos insuficientes");
        cantidadVasos -= cantidad;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public int getContenido() {
        return contenido;
    }
}
