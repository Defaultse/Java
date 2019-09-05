package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int S = a*a;
	int P = 4*a;
	double d = Math.sqrt(2*a*a);
	System.out.println("Area :" + S);
	System.out.println("Perimeter :" + P);
	System.out.println("Diagonal :"+d);
    }
}
