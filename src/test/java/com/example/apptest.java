package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
    ArithmeticOperations op = new ArithmeticOperations();
    
    @Test
    public void testAdd() {
        assertEquals(15, op.add(10, 5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(5, op.subtract(10, 5));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(50, op.multiply(10, 5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.0, op.divide(10, 5));
    }
    
    @Test
    public void testModulo() {
        assertEquals(0, op.modulo(10, 5));
    }
}