package com.itla.cafe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestVaso {
    @Test
    public void deberiaDevolverVerdaderoSiExistenVasos() {
        assertTrue(new Vaso(2, 10).hasVasos(1));
    }

    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos() {
        assertFalse(new Vaso(2, 10).hasVasos(20));
    }

    @Test
    public void deberiaRestarCantidadDeVaso() {
        Vaso v = new Vaso(5, 10);
        v.giveVasos(1);
        assertEquals(9, v.getCantidadVasos());
    }
}
