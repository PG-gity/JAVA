package com.company;
import java.util.Scanner;


public class ExamPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum marks for subject Each subject :");
        int maxMarks = 5 * sc.nextInt();
        System.out.println("Enter marks Physics : ");
        float Physics = sc.nextFloat();
        System.out.println("Enter marks Chemistry : ");
        float Chemistry = sc.nextFloat();
        System.out.println("Enter marks Biology : ");
        float  Biology = sc.nextFloat();
        System.out.println("Enter marks Mathematics : ");
        float Mathematics = sc.nextFloat();
        System.out.println("Enter marks English : ");
        float English = sc.nextFloat();
        float TM = Physics+Chemistry+ Biology+Mathematics+English;
        System.out.println("Total marks = "+ TM);
        float Per = (TM/maxMarks)*100;
        System.out.println("Percentage = "+ Per);


    }
}

