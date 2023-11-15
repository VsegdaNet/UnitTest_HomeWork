

import HomeWork3.MainHWTaskTwo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class testHomeWork3MainHWTaskTwo {

    MainHWTaskTwo tast;
    @BeforeEach
    void setup() {
        tast = new MainHWTaskTwo();
    }


    @ParameterizedTest
    @ValueSource(ints = {28, 39, 76, 34})
    void testTrueNumberInInterval(int n) {
        assertTrue(tast.numberInInterval(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {-28, 3, 1336, 134})
    void testFalseNumberInInterval(int n) {
        assertFalse(tast.numberInInterval(n));
    }


}
