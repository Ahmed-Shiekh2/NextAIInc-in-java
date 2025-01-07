package com.mycompany;

public class NextAIInc {

    // Method to calculate total weekly pay
    public void calculatePay(int basePay, int hoursWorked) {
        // Check if base pay is below the minimum allowed rate
        if (basePay < 30000) {
            System.out.println("Error: Base pay is below the minimum required rate of UGX 30,000.");
            return;
        }

        // Check if hours worked exceed the maximum limit
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked exceed the maximum allowed limit of 72 hours.");
            return;
        }

        int regularHours = 48;
        int overtimeHours = 0;
        int totalPay = 0;

        // Calculate regular and overtime pay
        if (hoursWorked > regularHours) {
            overtimeHours = hoursWorked - regularHours;
            totalPay = (regularHours * basePay) + (overtimeHours * (basePay * 2));
        } else {
            totalPay = hoursWorked * basePay;
        }

        // Print the total pay
        System.out.println("Total weekly pay: UGX " + totalPay);
    }

    public static void main(String[] args) {
        // Create an instance of NextAIInc
        NextAIInc nextAIInc = new NextAIInc();

        // Test Case 1: Contractor A
        System.out.println("Contractor A:");
        nextAIInc.calculatePay(30000, 51);  // UGX 30,000/hour, 51 hours worked

        // Test Case 2: Contractor B
        System.out.println("\nContractor B:");
        nextAIInc.calculatePay(20000, 40);  // UGX 20,000/hour, 40 hours worked

        // Test Case 3: Contractor C
        System.out.println("\nContractor C:");
        nextAIInc.calculatePay(35000, 96);  // UGX 35,000/hour, 96 hours worked
    }
}
