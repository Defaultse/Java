package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Input 'a':");
        int a = input.nextInt();
       // int a = Integer.parseInt(inputNumber);

        System.out.println("Input 'b':");
        int b = input.nextInt();
        //int b = Integer.parseInt(inputNumber2);

        System.out.println("Input 'c':");
        int c = input.nextInt();
        //int c = Integer.parseInt(inputNumber3);

        double D = b*b-4*a*c;

        if(D>0){
        double x1 = (-b+Math.sqrt(D))/2*a;
        double x2 = (-b-Math.sqrt(D))/2*a;
        System.out.println("Roots are: "+x1+" and "+x2);
        }
        else if(D==0){
            double x=(-b)/(2*a);
            System.out.println("Root is:"+x);
        }
        else if(D<0)
        { System.out.println("No answer");}



    }

}
