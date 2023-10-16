package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to the neighborhood library." + " Please choose an option");
        System.out.println("1)Show Available Books");
        System.out.println("2)Show Checked Out Books");
        System.out.println("3)Exit");


Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    switch(userInput) {
        case"1":
            System.out.println("Available books:");



    }
        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20,};
        Book book1 =  new Book(3546, "0446310786" ,"To Kill A MockingBird", true, "Chris");
        Book book2 = new Book(2323, "9781508294757", "Supermarket", false, "No one" );









    }
}