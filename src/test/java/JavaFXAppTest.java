import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void multiply(){
        JavaFXApp obj = new JavaFXApp();
        assertEquals(10, obj.computeMultiply(5,2));
    }
}