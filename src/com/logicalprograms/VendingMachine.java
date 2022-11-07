package com.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
    public void countCurrency(int amount) {

        int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int[] noteCounter = new int[7];

        // function to count and print currency notes
        for (int i = 0; i < 7; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // // Print notes
        System.out.println("Currency Count :");
        for (int i = 0; i < 7; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount To Withdrawl :");
        int amount = sc.nextInt();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.countCurrency(amount);
    }
}
