package com.logicalprograms;

import java.util.Scanner;

public class DayOfWeek {

    public static void findingDay(int y, int m, int d) {

        int y0, m0, d0, x;
        y0 = y - (14 - m) / 12;
        x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println(d0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year");
        int y = sc.nextInt();
        System.out.println("Enter Month(1-12 for Jan-Dec)");
        int m = sc.nextInt();
        System.out.println("Enter Day(0-6 for Sun-Sat)");
        int d = sc.nextInt();
        findingDay(y,m,d);
    }
}
