package com.company;
import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check whether it is Leap year or not: ");
        int year = input.nextInt();
        if(year%400==0 || year%4==0){
            System.out.println("Leap year");
        }
        else
            System.out.println("Normal year");

    }
}
