/*
* Author: Imrul Hasan Sifat, Date: 05.08.2025, Time: 01:05 AM
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
        float yearlyInterestRate = scanner.nextFloat();
        scanner.nextLine(); // Consumes the extra character

        System.out.print("Enter time (format: <amount>m or <amount>y): ");
        String time;

        // Ensuring the time format is okay!
        while(true) {
            time = scanner.nextLine();
            if(time.endsWith("y") || time.endsWith("m")) {
                break;
            }
            else {
                System.out.println("\nInvalid time format. Please use <amount>y or <amount>m!!\n");
                System.out.print("Enter time (format: <amount>m or <amount>y): ");
            }
        }

        String timeNumeric = time.substring(0, time.length() - 1); // Removing the string part
        float timeFloat = Float.parseFloat(timeNumeric);

        // Converts time to year if given in months
        if(time.charAt(time.length() - 1) == 'm') {
            timeFloat /= 12.0F;
        }

        float interest = (principalAmount * yearlyInterestRate * timeFloat) / 100.0F;
        System.out.printf("\nTotal interest is: %.2f\n", interest);
    }
}