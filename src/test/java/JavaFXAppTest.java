import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {

    JavaFXApp app = new JavaFXApp();

    @Test
    void aDummyTest() {
        assertEquals(0, 0);
    }

    @Test
    void computeAddTenplusTen() {
        int num1 = 10;
        int num2 = 10;
        int expected = num1 + num2;
        assertEquals(expected, app.computeAdd(num1, num2));
    }

    @Test
    void computeAddMinusTenplusTen() {
        int num1 = -10;
        int num2 = 10;
        int expected = num1 + num2;
        assertEquals(expected, app.computeAdd(num1, num2));
    }

    @Test
    void computeAddMinusTenplusMinusTen() {
        int num1 = -10;
        int num2 = 010;
        int expected = num1 + num2;
        assertEquals(expected, app.computeAdd(num1, num2));
    }
}