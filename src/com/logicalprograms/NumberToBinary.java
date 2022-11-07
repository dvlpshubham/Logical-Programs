package com.logicalprograms;

import java.util.Scanner;

public class NumberToBinary {
    public static void toBinary(int decimal) {
        int[] binaryNum = new int[1000];

        int i = 0;
        while (decimal > 0) {

                //   storing remainder

            binaryNum[i] = decimal % 2;
            decimal = decimal / 2;
            i++;
        }

                //     reversing array

        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int decimal = input.nextInt();
        toBinary(decimal);
    }
}
