package test;

import ejercicios.Triangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class TrianguloTest {
    @Test
    public void testNoEsUnTrianguloValido() {
        String valorEsperado = "No es un triángulo válido";
        String valorActual = Triangulo.evaluar(3.9, 6.0, 1.2);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testiso() {
        String valorEsperado = "El triángulo es isósceles";
        String valorActual = Triangulo.evaluar(1.9, 2, 2);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void esca() {
        String valorEsperado = "El triángulo es escaleno";
        String valorActual = Triangulo.evaluar(3, 5, 4);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void equi() {
        String valorEsperado = "El triángulo es equilátero";
        String valorActual = Triangulo.evaluar(5, 5, 5);
        assertEquals(valorEsperado, valorActual);
    }
}
