package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P07_GhettoNumeralSystem {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String[] ghetoNumSystem = new String[10];

        ghetoNumSystem[0] = "Gee";
        ghetoNumSystem[1] = "Bro";
        ghetoNumSystem[2] = "Zuz";
        ghetoNumSystem[3] = "Ma";
        ghetoNumSystem[4] = "Duh";
        ghetoNumSystem[5] = "Yo";
        ghetoNumSystem[6] = "Dis";
        ghetoNumSystem[7] = "Hood";
        ghetoNumSystem[8] = "Jam";
        ghetoNumSystem[9] = "Mack";

        String inputNumber = input.nextLine();
        //char[] inputNumberCharArr = inputNumber.toCharArray();
        int currentNum = 0;
        String outputString = "";


        for (int i = 0; i < inputNumber.length(); i++) {
            currentNum = inputNumber.charAt(i)-'0';
            outputString = outputString + ghetoNumSystem[currentNum];
        }
        System.out.println(outputString);
    }
}
