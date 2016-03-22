package com.company;

import java.util.Scanner;
import sun.security.util.Length;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P05_PrintCharacterTriangle {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

//        int offset = 97;
//        char currentChar = ' ';
//        String currentString = "";
//        int i = 0;
//
//        for (i = i+offset; i < number+offset; i++) {
//            currentChar = (char) i;
//            currentString = currentString + currentChar + " ";
//            //System.out.print(currentChar + " ");
//            System.out.println(currentString);
//        }
//
//        for (i = 1; i <= number; i++) {
//            currentString = currentString.substring(0, currentString.length()-2);
//            System.out.println(currentString);
//        }

        // Second try
        // Rising
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }
        //Falling
        for (int i = number-1; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }
    }




}
