package com.company;
import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        boolean x=true;
        while(x){
        System.out.println("Enter Your choice");
        System.out.println("+  for  Addition");
        System.out.println("-  for  Subtraction");
        System.out.println("*  for  Multiplication");
        System.out.println("/  for  Division");
        System.out.println("**  for  Square");
        System.out.println("E for Exit");


            Scanner input = new Scanner(System.in);
            String oper = input.next();
            switch (oper) {
                case "+":
                    System.out.println("Enter Two numbers to Add");
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println("Enter Two numbers to Subtract");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println("Enter Two numbers to Multiply");
                    int c = input.nextInt();
                    int d = input.nextInt();
                    System.out.println(c * d);
                    break;
                case "/":
                    System.out.println("Enter Two numbers to Divide");
                    int e = input.nextInt();
                    int f = input.nextInt();
                    System.out.println(e / f);
                    break;
                case "**":
                    System.out.println("Enter a number to get square:");
                    int g = input.nextInt();
                    System.out.println(g * g);
                    break;
                default:
                    System.out.println("Enter a valid Choice");
                case "E":
                    x=false;

            }

        }

    }
}
