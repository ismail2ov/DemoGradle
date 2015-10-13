package es.develex.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ismail on 13/10/2015.
 */
public class CalculadoraTest {

    Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(10, calculadora.sumar(4, 6), 0);
    }

    @Test
    public void testRestar() {
        assertEquals(-2, calculadora.restar(4, 6), 0);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(24, calculadora.multiplicar(4, 6), 0);
    }

    @Test
    public void testDividir() {
        assertEquals("6 dividido a 4 es 1.5", 1.5, calculadora.dividir(6, 4), 0);
        assertEquals("1 dividido a 2 es 0.5", 0.6, calculadora.dividir(1, 2), 0.1);
    }

    @Test(expected = Exception.class)
    public void testDividirACero() {
        calculadora.dividir(6, 0);
    }
}
