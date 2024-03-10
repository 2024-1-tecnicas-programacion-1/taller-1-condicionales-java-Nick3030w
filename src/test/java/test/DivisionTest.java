package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivisionnoExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testDivisionExacta1() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 4\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(8, 2);
        assertEquals(valorEsperado, valorActual);
    }
    public void testDivisionnoExacta1() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 1\n"
                + "Residuo: 2";
        String valorActual = Division.evaluar(9, 7);
        assertEquals(valorEsperado, valorActual);
    }
    public void testDivisionExacta2() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 10\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(20, 2);
        assertEquals(valorEsperado, valorActual);
        
    }
    public void testDivisionnoExacta2() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 78\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(550, 7);
        assertEquals(valorEsperado, valorActual);
    }
}
