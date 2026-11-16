package com.itla.cafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAzucarero {
    @Test
    public void deberiaDevolverVerdaderoSiExisteSuficienteAzucar() {
        Azucarero a = new Azucarero(10);
        assertTrue(a.hasAzucar(5));
        assertTrue(a.hasAzucar(10));
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisteSuficienteAzucar() {
        assertFalse(new Azucarero(10).hasAzucar(15));
    }

    @Test
    public void deberiaRestarAzucar() {
        Azucarero a = new Azucarero(5);
        a.giveAzucar(5);
        assertEquals(0, a.getCantidadAzucar());
        a.giveAzucar(0);
        assertEquals(0, a.getCantidadAzucar());
    }
}
