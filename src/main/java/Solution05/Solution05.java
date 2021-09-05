/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Anthony Sevarino
 */

/* Program Start
 * establish scanner
 * ask user for the first number
 * take value as string
 * ask user for the second number
 * take value as string
 * convert first and second numbers from strings to integers
 * print in one function an addition, subtraction, multiplication and division problem each on a new line
 */

package Solution05;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the first number?");
        String value1 = scnr.nextLine();
        System.out.println("What is the second number?");
        String value2 = scnr.nextLine();
        number1 = Integer.parseInt(value1);
        number2 = Integer.parseInt(value2);
        System.out.printf(number1 + " + " + number2 + " = %d" + "\n"
                + number1 + " - " + number2 + " = %d" + "\n"
                + number1 + " * " + number2 + " = %d" + "\n"
                + number1 + " / " + number2 + " = %d"
                , number1+number2, number1-number2, number1*number2, number1/number2);
    }
}
