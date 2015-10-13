package es.develex.calculadora;

/**
 * Created by Ismail on 13/10/2015.
 */
public class Calculadora {

    public float sumar(float a, float b) {
        return a + b;
    }

    public float restar(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        if (b == 0)
            throw new RuntimeException("No se puede dividir entre cero!!!");
        else
            return a / b;
    }
}
