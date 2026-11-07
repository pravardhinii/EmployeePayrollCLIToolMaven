package com.example.payroll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateNetSalaryStandard() {
        Calculator calculator = new Calculator();
        double netSalary = calculator.calculateNetSalary(5000.0, 20.0);
        assertEquals(4000.0, netSalary, 0.001);
    }

    @Test
    public void testCalculateNetSalaryZeroTax() {
        Calculator calculator = new Calculator();
        double netSalary = calculator.calculateNetSalary(3000.0, 0.0);
        assertEquals(3000.0, netSalary, 0.001);
    }

    @Test
    public void testCalculateNetSalaryInvalidNegative() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateNetSalary(-1000.0, 15.0);
        });
    }
}