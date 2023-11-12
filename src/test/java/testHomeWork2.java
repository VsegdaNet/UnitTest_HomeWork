

import HomeWork2.Car;
import HomeWork2.Motorcycle;
import HomeWork2.Vehicle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testHomeWork2 {

    Motorcycle mot1 = new Motorcycle("Suzuki", "H500", 2019);
    Car car1 = new Car("BMW", "M5", 2019);

    @Test
    void testInstanceof() {
        assertTrue(car1 instanceof Vehicle);
    }

    @Test
    void testCarFourWheels(){
        assertEquals(4, car1.getNumWheels());
    }

    @Test
    void testMotorcycleTwoWheels(){
        assertEquals(2, mot1.getNumWheels());
    }

    @Test
    void testSpeedMotorcycleToDrive(){
        mot1.testDrive();
        assertEquals(75, mot1.getSpeed());
    }
    @Test
    void testSpeedCarToDrive(){
        car1.testDrive();
        assertEquals(60, mot1.getSpeed());
    }

    @Test
    void testNullSpeedMotorcycle(){
        mot1.testDrive();
        mot1.park();
        assertEquals(0, mot1.getSpeed());
    }

    @Test
    void testNullSpeedCar(){
        car1.testDrive();
        car1.park();
        assertEquals(0, car1.getSpeed());
    }





}
