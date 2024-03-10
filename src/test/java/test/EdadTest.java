package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2000);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void test2005julio2() {
        String valorEsperado = "Usted tiene 18 años";
        String valorActual = Edad.evaluar(2, 7, 2005);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void test1969febrero1() {
        String valorEsperado = "Usted tiene 55 años";
        String valorActual = Edad.evaluar(1, 2, 1969);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void test1976agosto19() {
        String valorEsperado = "Usted tiene 47 años";
        String valorActual = Edad.evaluar(19, 8, 1976);
        assertEquals(valorEsperado, valorActual);
    }
}
