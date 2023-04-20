import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {

    private final JavaFXApp calculator = new JavaFXApp();

    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void testAdditionWithPositiveNumbers() {
        int result = calculator.computeAdd(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        int result = calculator.computeAdd(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    void testAdditionWithZero() {
        int result = calculator.computeAdd(0, 5);
        assertEquals(5, result);
    }
}