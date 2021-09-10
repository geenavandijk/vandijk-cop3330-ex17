/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package org.example;

import java.util.Scanner;

public class BloodAlcoholCalculator {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        int gender, alcohol, weight, time;

        float r, bac;

        r = (float) 0.73;

        System.out.printf("Enter a 1 if you are male or a 2 if you are female: ");
        gender = input.nextInt();

        if (gender == 2) r = (float) 0.66;

        System.out.printf("How many ounces of alcohol did you have? ");
        alcohol = input.nextInt();

        System.out.printf("What is your weight in pounds? ");
        weight = input.nextInt();

        System.out.printf("How many hours has it been since your last drink? ");
        time = input.nextInt();

        bac = (float) (((alcohol*5.14/weight) * r) - (0.015*time));

        System.out.println("\n\nYour BAC is "+ bac);

        if (bac < 0.08)
            System.out.printf("It is legal for you to drive.");
        else
            System.out.printf("It is not legal for you to drive");
    }
}
