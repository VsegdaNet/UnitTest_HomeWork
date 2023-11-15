import HomeWork3.MainHW;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class testHomeWork3 {

    MainHW tast = new MainHW();

    @Test
    void testTrueEvenOddNumber(){
        assertTrue(tast.evenOddNumber(4));
    }

    @Test
    void testFalseEvenOddNumber(){
        assertFalse(tast.evenOddNumber(5));
    }


}
