package org.example;

import java.util.Scanner;


/*
So you had a good start with the book class but I'm not seeing a ton of logic in the main class
You probably want to start off by creating an array of books and then using while loops and switch
statements to collect user info. Let me know when you think you can get this done.
 */
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