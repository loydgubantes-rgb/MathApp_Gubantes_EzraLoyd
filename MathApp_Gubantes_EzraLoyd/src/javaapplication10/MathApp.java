/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Ezra Loyd P. Gubantes
 */
public class MathApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    double a1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double a2 = input.nextDouble();
                    System.out.println("Result: " + (a1 + a2));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    double s1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double s2 = input.nextDouble();
                    System.out.println("Result: " + (s1 - s2));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    double m1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double m2 = input.nextDouble();
                    System.out.println("Result: " + (m1 * m2));
                    break;

                case 4: // Division with edge-case handling
                    System.out.print("Enter dividend: ");
                    double d1 = input.nextDouble();
                    System.out.print("Enter divisor: ");
                    double d2 = input.nextDouble();
                    if (d2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (d1 / d2));
                    }
                    break;

                case 5: // Factorial with edge-case handling
                    System.out.print("Enter a non-negative integer: ");
                    int fNum = input.nextInt();
                    if (fNum < 0) {
                        System.out.println("Error: Factorial of a negative number is undefined.");
                    } else {
                        long factorial = 1;
                        for (int i = 1; i <= fNum; i++) {
                            factorial *= i;
                        }
                        System.out.println("Result: " + factorial);
                    }
                    break;

                case 6: // Power (x^y)
                    System.out.print("Enter base (x): ");
                    double base = input.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exponent = input.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;

                case 7: // Sum of 1 to N
                    System.out.print("Enter positive integer N: ");
                    int nSum = input.nextInt();
                    if (nSum < 1) {
                        System.out.println("Error: Please enter a number greater than or equal to 1.");
                    } else {
                        int sum = 0;
                        for (int i = 1; i <= nSum; i++) {
                            sum += i;
                        }
                        System.out.println("Result: " + sum);
                    }
                    break;

                case 8: // Check Prime
                    System.out.print("Enter an integer: ");
                    int pNum = input.nextInt();
                    boolean isPrime = pNum > 1;
                    for (int i = 2; i <= Math.sqrt(pNum); i++) {
                        if (pNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println("Result: " + pNum + (isPrime ? " is a prime number." : " is NOT a prime number."));
                    break;

                case 9: // GCD
                    System.out.print("Enter first integer: ");
                    int g1 = input.nextInt();
                    System.out.print("Enter second integer: ");
                    int g2 = input.nextInt();
                    int num1 = Math.abs(g1);
                    int num2 = Math.abs(g2);
                    while (num2 != 0) {
                        int temp = num2;
                        num2 = num1 % num2;
                        num1 = temp;
                    }
                    System.out.println("Result GCD: " + num1);
                    break;

                case 10: // Absolute value
                    System.out.print("Enter a number: ");
                    double absNum = input.nextDouble();
                    System.out.println("Result: " + Math.abs(absNum));
                    break;

                case 11: // Average of N numbers (Array)
                    System.out.print("Enter the number of elements (N): ");
                    int nAvg = input.nextInt();
                    if (nAvg <= 0) {
                        System.out.println("Error: Array size must be greater than 0.");
                    } else {
                        double[] avgArray = new double[nAvg];
                        double totalSum = 0;
                        for (int i = 0; i < nAvg; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            avgArray[i] = input.nextDouble();
                            totalSum += avgArray[i];
                        }
                        System.out.println("Result Average: " + (totalSum / nAvg));
                    }
                    break;

                case 12: // Maximum of N numbers (Array)
                    System.out.print("Enter the number of elements (N): ");
                    int nMax = input.nextInt();
                    if (nMax <= 0) {
                        System.out.println("Error: Array size must be greater than 0.");
                    } else {
                        double[] maxArray = new double[nMax];
                        for (int i = 0; i < nMax; i++) {
                            System.out.print("Enter value " + (i + 1) + ": ");
                            maxArray[i] = input.nextDouble();
                        }
                        double maxVal = maxArray[0];
                        for (int i = 1; i < nMax; i++) {
                            if (maxArray[i] > maxVal) {
                                maxVal = maxArray[i];
                            }
                        }
                        System.out.println("Result Maximum: " + maxVal);
                    }
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from options 0-12.");
            }
        } while (choice != 0);

        input.close();
    }
}
