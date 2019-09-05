package com.company;

import java.util.Scanner;

public class Main {

    public static boolean checkPalindrome(String a) {
        String reversed = a.StringBuffer().reverse().toString();


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (checkPalindrome(word) == true) {
            System.out.println("Yes");
        }
    }
}
