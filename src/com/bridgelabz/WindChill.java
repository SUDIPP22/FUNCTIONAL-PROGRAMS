package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    static void windChill(double a, double b) {
        if (a > 50 || b < 3 || b > 120) {
            System.out.println("The Formula is not valid");
        } else {
            double w = 35.74 + 0.6215 * a + ((0.4275 * a - 35.75) * Math.pow(b, 0.16));
            System.out.println("For " + a + "°F" + " & " + b + "mph wind speed Wind Chill Factor is : " + w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in °F ");
        double t = sc.nextDouble();
        System.out.println("Enter Wind Speed in mph ");
        double v = sc.nextDouble();
        windChill(t, v);
    }
}
