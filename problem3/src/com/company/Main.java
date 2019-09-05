package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String gradeInput = input.nextLine();
        double grade = Double.parseDouble(gradeInput);
        if(grade<=100 && grade>=95) System.out.println("Your grade is 'A'");
        else if(grade<=94 && grade>=90) System.out.println("Your grade is 'A-'");
        else if(grade<=89 && grade>=85) System.out.println("Your grade is 'B+'");
        else if(grade<=84 && grade>=80) System.out.println("Your grade is 'B'");
/*        switch (gradeInput){
            case "100":
                System.out.println();
                break;
        }*/
    }
}
