package com.mycompany.calculatorapp;

import java.util.Arrays;

/**
 *
 * @author Farida Fatali
 */
public class CalculatorWithMemory {

    private String[] operations;
    private double[] firstArguments;
    private double[] secondArguments;
    private double[] results;
    private int memoryIndex;

    public CalculatorWithMemory() {
        operations = new String[10];
        firstArguments = new double[10];
        secondArguments = new double[10];
        results = new double[10];
        memoryIndex = 0;
    }
    
    public void add(double a, double b){
        double result = a + b;
        saveOperation("add", a, b, result);
        System.out.println(a + " + " + b + " = " + result);
    }
    
    public void subtract(double a, double b){
        double result = a - b;
        saveOperation("subtract", a, b, result);
        System.out.println(a + " - " + b + " = " + result);
    }
    
    public void multiply(double a, double b){
        double result = a * b;
        saveOperation("multiply", a, b, result);
        System.out.println(a + " * " + b + " = " + result);
    }
    
    public void divide(double a, double b){
        if(b == 0){
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result = a / b;
        saveOperation("divide", a, b, result);
        System.out.println(a + " / " + b + " = " + result);
        System.out.println();
    }
    
    public void displayMemory(){
        if(memoryIndex == 0){
            System.out.println("Memory is empty.");
            return;
        }
        System.out.println("Memory Contents:");
        for(int i = 0; i < memoryIndex; i++){
            System.out.println(operations[i] + ": " + firstArguments[i] + ", " + secondArguments[i] + " = " + results[i]);
        }
    }
    
    private void saveOperation(String operation, double a, double b, double result){
        operations[memoryIndex] = operation;
        firstArguments[memoryIndex] = a;
        secondArguments[memoryIndex] = b;
        results[memoryIndex] = result;
        memoryIndex++;
        if(memoryIndex >= operations.length){
            expandMemory();
        }
    }
    
    private void expandMemory(){
        int newCapacity = operations.length * 2;
        operations = Arrays.copyOf(operations, newCapacity);
        firstArguments = Arrays.copyOf(firstArguments, newCapacity);
        secondArguments = Arrays.copyOf(secondArguments, newCapacity);
        results = Arrays.copyOf(results, newCapacity);
    }
}

