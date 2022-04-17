package com.company;
import java.util.Scanner;

public class LogicalsOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a==0){
            System.out.println("Zero");
        }
        else {
//        String value = a>=0? "+Ve no." : "-Ve no,";
//        System.out.println(value);
            System.out.println(a > 0 ? "+Ve no." : "-Ve no,");
        }

    }
}
