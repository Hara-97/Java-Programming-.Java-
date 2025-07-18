// 4.	Write a program to take your name as a string input from the console and print a personalized greeting message. 

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 

        // Print personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the Java world.");

        sc.close();
    }
}

