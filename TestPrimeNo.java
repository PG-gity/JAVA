package com.company;
import java.util.Scanner;

public class TestPrimeNo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numb = inp.nextInt();
        if(numb >= 5) {
            if (((numb * numb) - 1) % 24 == 0) {
                System.out.println("Prime number");
            }
            else {
                System.out.println("Composite number");
            }
        }
        else if(numb==2 || numb==3){
            System.out.println("Prime number");

        }
        else if(numb==1){
            System.out.println("Neither prime nor Composite");


        }
        else{
            System.out.println("Composite no.");
        }
    }
}
