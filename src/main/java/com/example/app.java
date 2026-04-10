package com.example;

public class App 
{
    public static void main( String[] args )
    {
        ArithmeticOperations op = new ArithmeticOperations();
        
        System.out.println("=== ARITHMETIC OPERATIONS ===\n");
        System.out.println("Add (10 + 5) = " + op.add(10, 5));
        System.out.println("Subtract (10 - 5) = " + op.subtract(10, 5));
        System.out.println("Multiply (10 * 5) = " + op.multiply(10, 5));
        System.out.println("Divide (10 / 5) = " + op.divide(10, 5));
        System.out.println("Modulo (10 % 5) = " + op.modulo(10, 5));
    }
}