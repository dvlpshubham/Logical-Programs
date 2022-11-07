package com.logicalprograms;

import java.util.Scanner;

public class NewtonsMethod {
    public static void findingSqrt(double c, double epsilon) {

        double t = c;

         // repeating until desired accuracy reached

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        System.out.println(t);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        double c = input.nextDouble();
        double epsilon = 1.0e-15;
        findingSqrt(c, epsilon);
    }
}
