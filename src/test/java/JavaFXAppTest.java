import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void fabianTest(){
        JavaFXApp javaFXApp = new JavaFXApp();
        assertEquals(2,javaFXApp.computeDivide(10, 5) );
    }
}