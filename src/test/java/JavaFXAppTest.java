import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void computeMultiply() {
        int getal1 = 1;
        int getal2 = 1;

        JavaFXApp javaFXApp = new JavaFXApp();
        assertEquals(2, javaFXApp.computeAdd(getal1, getal2));
    }
}