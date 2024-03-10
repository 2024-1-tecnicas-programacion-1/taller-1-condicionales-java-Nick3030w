package test;

import ejercicios.Ordenamiento;
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
public class OrdenamientoTest {
    @Test
    public void testNo() {
        String valorEsperado = "0 1 6 7 ";
        String valorActual = Ordenamiento.evaluar(7, 0, 6, 1);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1() {
        String valorEsperado = "0 3 6 9 ";
        String valorActual = Ordenamiento.evaluar(9, 3, 6, 0);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test2() {
        String valorEsperado = "2 5 9 10 ";
        String valorActual = Ordenamiento.evaluar(9, 10, 2, 5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test3() {
        String valorEsperado = "5 6 7 8 ";
        String valorActual = Ordenamiento.evaluar(8, 7, 6, 5);
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test4() {
        String valorEsperado = "56 60 68 92 ";
        String valorActual = Ordenamiento.evaluar(60, 92, 68, 56);
        assertEquals(valorEsperado, valorActual);
    }
    
}
