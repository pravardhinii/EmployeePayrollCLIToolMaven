package com.example.payroll;

public class Calculator {
    
    public double calculateNetSalary(double baseSalary, double taxRate) {
        if (baseSalary < 0 || taxRate < 0) {
            throw new IllegalArgumentException("Salary and tax rate must be non-negative.");
        }
        if (taxRate > 100) {
            throw new IllegalArgumentException("Tax rate cannot exceed 100%.");
        }
        double taxDeduction = baseSalary * (taxRate / 100.0);
        return baseSalary - taxDeduction;
    }
}