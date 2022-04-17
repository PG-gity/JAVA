package com.company;

import java.sql.SQLOutput;

public class stringMethods {
    public static void main(String[] args){
        String name = "Gyani Baba";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String nonTrimmedString = "  Gyan  ";

        System.out.println(nonTrimmedString.trim()); // .trim :removes leading and trailing nonstring part
        System.out.println(name.substring(3));
        System.out.println(name.substring(0,8));// End(i.e 8) Excluded
        System.out.println(name.replace('a','z'));// mind single quotation
        System.out.println(name.replace("a"," LI "));// Double Quotation
        System.out.println(name.startsWith("Gy"));
        System.out.println(name.endsWith("Gy"));
        //find index
        System.out.println(name.indexOf("a")); //shows first index for that particular letter
        System.out.println(name.indexOf("a",5));//find first a after index no.g
        System.out.println(name.equals("Gyani Baba"));
        //Ignores Cases
        System.out.println(name.equalsIgnoreCase("gyani baba"));


    }
}
