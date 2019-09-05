package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        double balance;
        System.out.print("Enter your balance:");

        Scanner inputBalance = new Scanner(System.in);
        balance = inputBalance.nextDouble();

        System.out.println("Current balance is :" + balance);
        System.out.print("Print how much interest do you want to add(in percentage):");

        Scanner input = new Scanner(System.in);
        String inputNumber = input.nextLine();
        double a = Double.parseDouble(inputNumber);

        double interest;
        interest = ((balance*(a/100))+balance);
        System.out.println("Your current balance with interest is: "+interest);

    }
}
