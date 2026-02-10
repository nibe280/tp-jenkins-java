
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests unitaires pour la classe Factorial.
 */
public class FactorialTest {

    /**
     * Teste la factorielle de 0 (doit retourner 1).
     */
    @Test
    public void testFactorialZero() {
    assertEquals(1L, Factorial.factorial(0), "La factorielle de 0 doit être 1");
    }

    /**
     * Teste la factorielle de 1 (doit retourner 1).
     */
    @Test
    public void testFactorialOne() {
    assertEquals(1L, Factorial.factorial(1), "La factorielle de 1 doit être 1");
    }

    /**
     * Teste la factorielle de 5 (doit retourner 120).
     */
    @Test
    public void testFactorialFive() {
    assertEquals(120L, Factorial.factorial(5), "La factorielle de 5 doit être 120");
    }

    /**
     * Teste le cas d'un nombre négatif (doit lever une exception).
     */
    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1),
                "Doit lever IllegalArgumentException pour un nombre négatif");
    }
}