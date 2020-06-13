package model;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora ca = new Calculadora();

    @Test
    public void somarPositivo() {
        assertEquals(2.0, ca.somar(1.0, 1.0), 0.1);
    }

    @Test
    public void somarNegativo() {
        assertEquals(-1.0, ca.somar(1.0, -2.0), 0.1);
    }

    @Test
    public void subtrairPositivo() {
        assertEquals(2.0, ca.subtrair(3.0, 1.0), 0.1);
    }

    @Test
    public void subtrairNegativo() {
        assertEquals(-1.0, ca.subtrair(1.0, 2.0), 0.1);
    }

    @Test
    public void multiplicarPositivo() {
        assertEquals(3.0, ca.multiplicar(3.0, 1.0), 0.1);
    }

    @Test
    public void multiplicarNegativo() {
        assertEquals(-2.0, ca.multiplicar(2.0, -1.0), 0.1);
    }

    @Test
    public void dividir0() {
        assertEquals(0.0, ca.multiplicar(1.0, 0.0), 0.1);
    }
}