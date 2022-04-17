package com.company;
import java.util.Scanner;


public class KillometersToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Km to convert into Miles : ");
        float km = sc.nextFloat();
        double miles = km*0.621371;
        System.out.println(km +" Km is "+ miles +" miles.");

    }

}
