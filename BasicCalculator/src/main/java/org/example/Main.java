package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();

        System.out.println("Give me the second number;");
        double userSecondNumber = scanner.nextDouble();
        scanner = new Scanner(System.in);

        System.out.println("What are you doing with these numbers?");

        String Possiblecalculations = scanner.nextLine();

        if(Possiblecalculations.equalsIgnoreCase("Add")){
            System.out.println("Your answer 17,");
        }
        else if(Possiblecalculations.equalsIgnoreCase("Subtract")) {
            System.out.println("Your answer -7");
        }
        else if(Possiblecalculations.equalsIgnoreCase("Multiply")){
            System.out.println("Your answer 60");
        }
        else if(Possiblecalculations.equalsIgnoreCase("Divide")){
            System.out.println("Your answer 41");
        }

        //double answer = AddTwoNumbers(userNumber, secondUserNumber);






    }


}