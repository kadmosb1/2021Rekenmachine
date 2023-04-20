import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDivide {

    @Test
    void DivideByZero() {
        JavaFXApp obj = new JavaFXApp();

        assertThrows(ArithmeticException.class, () -> {
            obj.computeDivide(1,0);
        });
    }

    @Test
    void DivideOneByOne() {
        JavaFXApp obj = new JavaFXApp();
        int result = obj.computeDivide(1,1);
        assertEquals(1,result);
    }

    @Test
    void DivideFifteenByThree() {
        JavaFXApp obj = new JavaFXApp();
        int result = obj.computeDivide(15,3);
        assertEquals(5,result);
    }
}
