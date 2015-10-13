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
        float resultado = calculadora.sumar(4, 6);
        assertEquals(10, resultado, 0);
    }

    @Test
    public void testRestar() {
        float resultado = calculadora.restar(4, 6);
        assertEquals(-2, resultado, 0);
    }

    @Test
    public void testMultiplicar() {
        float resultado = calculadora.multiplicar(4, 6);
        assertEquals(24, resultado, 0);
    }

    @Test
    public void testDividir() {
        float resultado = calculadora.dividir(6, 4);
        assertEquals(1.5, resultado, 0);
    }

    @Test(expected = Exception.class)
    public void testDividirACero() {
        calculadora.dividir(6, 0);
    }
}
