package com.itla.cafe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMaquinaDeCafe {
    private MaquinaDeCafe maquina;
    private Vaso pequeno, mediano, grande;

    @Before
    public void setup() {
        maquina = new MaquinaDeCafe();
        pequeno = new Vaso(3, 10);
        mediano = new Vaso(5, 10);
        grande = new Vaso(7, 10);
        maquina.setCafetera(new Cafetera(50));
        maquina.setVasosPequeno(pequeno);
        maquina.setVasosMediano(mediano);
        maquina.setVasosGrande(grande);
        maquina.setAzucarero(new Azucarero(20));
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        assertSame(pequeno, maquina.getTipoVaso("pequeno"));
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        assertSame(mediano, maquina.getTipoVaso("mediano"));
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        assertSame(grande, maquina.getTipoVaso("grande"));
    }

    @Test
    public void deberiaDevolverNoHayVasos() {
        assertEquals("No hay Vasos", maquina.getVasoDeCafe(pequeno, 11, 2));
    }

    @Test
    public void deberiaDevolverNoHayCafe() {
        maquina.setCafetera(new Cafetera(2));

        assertEquals("No hay Cafe",
                maquina.getVasoDeCafe(pequeno, 1, 2));
    }

    @Test
    public void deberiaDevolverNoHayAzucar() {
        maquina.setAzucarero(new Azucarero(2));
        assertEquals("No hay Azucar", maquina.getVasoDeCafe(pequeno, 1, 3));
    }

    @Test
    public void deberiaRestarCafe() {
        maquina.getVasoDeCafe(pequeno, 1, 3);
        assertEquals(47, maquina.getCafetera().getCantidadCafe());
    }

    @Test
    public void deberiaRestarVasos() {
        maquina.getVasoDeCafe(pequeno, 1, 3);
        assertEquals(9, maquina.getVasosPequeno().getCantidadVasos());
    }

    @Test
    public void deberiaRestarAzucar() {
        maquina.getVasoDeCafe(pequeno, 1, 3);
        assertEquals(17, maquina.getAzucarero().getCantidadAzucar());
    }

    @Test
    public void deberiaDevolverFelicitaciones() {
        assertEquals("Felicitaciones", maquina.getVasoDeCafe(pequeno, 1, 3));
    }

    @Test
    public void noDebeDescontarSiFaltaCafe() {
        maquina.setCafetera(new Cafetera(0));
        assertEquals("No hay Cafe", maquina.getVasoDeCafe(pequeno, 1, 3));
        assertEquals(10, pequeno.getCantidadVasos());
        assertEquals(20, maquina.getAzucarero().getCantidadAzucar());
    }
}
