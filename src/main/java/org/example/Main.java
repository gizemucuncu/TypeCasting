package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer number:");
        int numInteger = input.nextInt();
        System.out.print("Enter Decimal number:");
        double numDouble = input.nextDouble();

        double newDouble = numInteger;
        System.out.println(numInteger + " Integer convert to Decimal: " + newDouble);

        int newInteger = (int) numDouble;
        System.out.println(numDouble + " Decimal convert to Integer: " + newInteger);

    }
}