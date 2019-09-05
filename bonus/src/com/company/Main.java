package com.company;

import java.util.Scanner;

public class Main {

    public static void duplicate(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;
            int j = 0;
            while (j < i){
                if ((i != j) && numbers[i] == numbers[j]) {
                    duplicate = true;
                }
                j++;
            }
            if (duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Values :");
        int array[]=new int[6];
        for (int i=0;i<6;i++)
        {
            array[i]=input.nextInt();
        }
        for (int i=0;i<6;i++)
        {
            System.out.println("Values are :"+array[i]);
        }
        duplicate
    }
}
