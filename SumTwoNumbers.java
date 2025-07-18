// 5.	Write a program that takes two integer numbers as input, calculates their sum, and prints the result. 
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two integer inputs
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Print result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
