package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asking the User to enter their name
        System.out.println("What is the employee's name? ");
        String name = scanner.nextLine();

        // Asking User hours they worked
        System.out.println("How many hours you worked? ");
        double hoursWorked = scanner.nextDouble();

        //Asking the user their pay rate
        System.out.println("What is your pay rate hourly? ");
        double payRate = scanner.nextDouble();

        // Calculating their gross pay
        double grossPay;
        grossPay = hoursWorked * payRate;

        System.out.printf("%s your gross pay is $%.2f", name,grossPay );


    }
}
