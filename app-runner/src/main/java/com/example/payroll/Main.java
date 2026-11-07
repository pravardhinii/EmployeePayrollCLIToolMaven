package com.example.payroll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  Multi-Module Employee Payroll CLI Tool");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Enter Employee Base Salary ($): ");
            double baseSalary = scanner.nextDouble();

            System.out.print("Enter Tax Rate (%): ");
            double taxRate = scanner.nextDouble();

            double netSalary = calculator.calculateNetSalary(baseSalary, taxRate);

            System.out.println("----------------------------------------");
            System.out.printf("Base Salary : $%.2f%n", baseSalary);
            System.out.printf("Tax Rate    : %.2f%%%n", taxRate);
            System.out.printf("Net Salary  : $%.2f%n", netSalary);
            System.out.println("========================================");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}