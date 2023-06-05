package com.mycompany.calculatorapp;

/**
 *
 * @author Farida Fatali
 */
public class CalculatorWithMemoryTest {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        
        calculator.add(5, 3);
        calculator.subtract(10, 7);
        calculator.multiply(4, 6);
        calculator.divide(12, 3);
        
        calculator.displayMemory();
    }
}
