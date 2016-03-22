package com.company;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P04_PrintCharacters {
    public static void main(String[] args) {

        // write your code here

//        for (char c = 'a'; c <= 'z' ; c++) {
//            if(c=='z'){
//                System.out.print(c);
//            }else{
//                System.out.print(c + " ");
//            }
//            //System.out.print(c + " ");
//        }
        char cc = 1;
        //System.out.println(cc);

        for (int i = 97; i < 200 ; i++) {
            cc = (char) i;
            if(cc == 'z'){
                System.out.print(cc);
                break;
            }
            System.out.print(cc + " ");
        }

    }
}
