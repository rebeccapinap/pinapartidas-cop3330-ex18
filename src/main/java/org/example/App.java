package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        double finaltemp = 0;
        int temp;

        // Calculates either Fahrenheit to Celsius or Celsius to Fahrenheit based on input
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String mode = stringInput.nextLine();

        if (mode.equals("C") || mode.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = numInput.nextInt();
            finaltemp = (temp - 32) * 5 / 9;
            //C = (F − 32) × 5 / 9
            System.out.printf("The temperature in Celsius is %.0f.", finaltemp);
        }
        else if (mode.equals("F") || mode.equals("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = numInput.nextInt();
            finaltemp = (temp * 9 / 5) + 32;
            //F = (C × 9 / 5) + 32
            System.out.printf("The temperature in Fahrenheit is %.0f.", finaltemp);
        }
    }
}
