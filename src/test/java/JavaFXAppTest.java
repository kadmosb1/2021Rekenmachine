import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    @Test
    void testComputeMultiply() {
        JavaFXApp app = new JavaFXApp();
        assertEquals(6, app.computeMultiply(2, 3));
    }
}