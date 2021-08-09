package com.bridgelabz;

import java.util.Scanner;

public class QuadraticEquation {
    // Printing the roots
    static void getRoots(double a, double b, double c) {
        double delta = (b * b) - (4.0 * a * c);
        if (delta > 0.0) {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            System.out.print("Root 1 is = " + x1);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.print("\nRoot 2 is = " + x2);
        } else
            System.out.println("Roots are not real");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Coefficient : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Coefficient : ");
        double b = sc.nextDouble();
        System.out.println("Enter Third Coefficient : ");
        double c = sc.nextDouble();
        getRoots(a, b, c);
        sc.close();
    }
}