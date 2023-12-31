package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan lenght in years: ");
        int years = scanner.nextInt();


        double monthlyInterestRate = (annualInterestRate /12 /100);
        int numberOfPayments = years * 12;

        double monthlyPayment =  principal*(monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        double totalInterest = (monthlyPayment * numberOfPayments) - principal;

        System.out.printf("Monthly payment: $%.2fn",monthlyPayment);

        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);


    }
}