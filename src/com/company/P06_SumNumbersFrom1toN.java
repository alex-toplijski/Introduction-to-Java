package com.company;

import java.util.Scanner;
/**
 * Created by Admin on 19.3.2016 г..
 */
public class P06_SumNumbersFrom1toN {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }

        System.out.println(sum);

    }
}
