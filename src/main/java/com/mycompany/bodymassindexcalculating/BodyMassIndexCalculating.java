package com.mycompany.bodymassindexcalculating;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=5IbBicO-Sf8&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=5
 * @author Farida Fatali
 */

/*
By taking the user's height and weight values, calculate the user's body mass index value according to the formula BMI = kg/(m*m) 
and print it. If the body mass index is less than 18.5, print "Lean", 
if it is between 18.5 and 24.9, print "Ideal", if it is between 25 and 29.9, print "Fat", 
if it is between 30 and 34.9, print "Obese", if it is greater than 35, print "Extremely obese".
*/

public class BodyMassIndexCalculating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight as meter: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height as kilogram: ");
        double height = scanner.nextDouble();
        
        double bodyMassIndex = height / (weight * weight);
        System.out.println("Your body mass index: " + bodyMassIndex);
        
        if (bodyMassIndex < 18.5){
            System.out.println("Weak");
        } else if (bodyMassIndex <= 24.9){
            System.out.println("Ideal");
        } else if (bodyMassIndex <= 29.9){
            System.out.println("Fat");
        } else if (bodyMassIndex <= 34.9){
            System.out.println("Obese");
        } else {
            System.out.println("Extremely obese");
        }
    }
}
