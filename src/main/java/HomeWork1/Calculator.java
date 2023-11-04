package HomeWork1;

public class Calculator {

//      метод calculateDiscount
        public double calculateDiscount(double summ, int sale){
            if (summ < 0 || sale < 0 || sale > 100){
                throw new ArithmeticException("Invalid input");
            }
            return summ - ((summ / 100) * sale);
        }
}
