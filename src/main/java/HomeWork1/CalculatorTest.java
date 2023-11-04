package HomeWork1;


import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        valid();
        invalid();


    }

    public static void valid(){
        Calculator result1 = new Calculator();
        System.out.println(result1.calculateDiscount(100, 99));
        assert 34 == result1.calculateDiscount(40, 15);
        assert 24.12 == result1.calculateDiscount(40.2, 40);
        assert 1 == result1.calculateDiscount(100, 99);
    }

    public static void invalid(){
        Calculator result2 = new Calculator();
        assertThrows("ArithmeticException", result2.calculateDiscount(10, 110));
        assertThrows("ArithmeticException", result2.calculateDiscount(- 10, 110));
        assertThrows("ArithmeticException", result2.calculateDiscount(10, -110));

    }



}