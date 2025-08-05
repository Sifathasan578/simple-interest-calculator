/*
* Author: Imrul Hasan Sifat, Date: 05.08.2025
* */
package com.sifat.hasan.imrul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n### Simple Interest Calculator ###\n");

        System.out.print("Enter principal amount: ");
        int principalAmount = scanner.nextInt();

        System.out.print("Enter yearly interest rate: ");
        double yearlyInterestRate = scanner.nextDouble();
        scanner.nextLine(); // Consumes the extra character or new line


        String time;
        while(true) { // Ensuring the time format is okay!
            System.out.print("Enter time (format: <amount>m or <amount>y): ");
            time = scanner.nextLine().trim();

            if(time.endsWith("y") || time.endsWith("m")) {
                break;
            } else {
                System.out.println("❌ Invalid time format. Please use <amount>y or <amount>m (e.g., 18m, 2.5y).\n");
            }
        }

        String timeNumeric = time.substring(0, time.length() - 1); // Removing the string part
        double timeInYears = Double.parseDouble(timeNumeric); // Converting string to double

        // Converts time to year if given in months
        if(time.charAt(time.length() - 1) == 'm') {
            timeInYears /= 12.0F;
        }

        double interest = (principalAmount * yearlyInterestRate * timeInYears) / 100.0;
        System.out.printf("\n✅ Total interest is: %.2f\n", interest);
    }
}