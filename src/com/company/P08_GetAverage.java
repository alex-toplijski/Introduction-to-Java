package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P08_GetAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        float a = Float.parseFloat(input.nextLine());
//        float b = Float.parseFloat(input.nextLine());
//        float c = Float.parseFloat(input.nextLine());
//
//        float average = (a + b + c) / 3;
//        System.out.printf("%.2f", average);

        float[] data = new float[3];
        for (int i = 0; i < 3 ; i++) {
            data[i] = Float.parseFloat(input.nextLine());
        }

        float sum = 0.0f;
        for(float d : data){
            sum+=d;
        }
        float avg = sum / data.length;

        System.out.printf("%.2f", avg);
    }
}
