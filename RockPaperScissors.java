package com.company;
import java.util.Random;
import java.util.Scanner;



public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int x =5;
        int uw = 0;
        int cw = 0;
        while(x>0) {
            System.out.println("To play press p\nTo exit the game press e");
            System.out.println("\tyou have "+x+" chances");
            String operation = input.next();



            switch(operation) {
                case "p":
                    Random rand = new Random();
                    int r = rand.nextInt(3);


                    System.out.println("Enter 0 for Paper:\nEnter 1 for Rock:\nEnter 2 for Scissor:");

                    Scanner inp = new Scanner(System.in);
                    int user_inp = inp.nextInt();

                    //To avoid writing again and again lets create win statements as below
                    String user_wins = "\n"+name + " you won the game";
                    String comp_wins = "\nComputer wins the game and " + name + " looses the game";

                    if ((user_inp == 2 && r == 0) || (user_inp == 0 && r == 2)) {
                        if (user_inp == 2) {
                            System.out.println(user_wins);
                            uw++;
                        } else {
                            System.out.println(comp_wins);
                            cw++;
                        }

                    } else {
                        if (user_inp < r) {
                            System.out.println(user_wins);
                            uw++;

                        } else if (user_inp > r) {
                            System.out.println(comp_wins);
                            cw++;
                        } else
                            System.out.println("\n\tDraw");
                    }
                    System.out.println("\nComputer's choice is " + r + "\nyour choice is " + user_inp);
                    System.out.println("\nComputer won "+cw+" times.");
                    System.out.println("You won "+uw+" times.");
                    if(cw>uw){
                        System.out.println("\tSo overall computer is winner");
                    }
                    else if(cw<uw){
                        System.out.println("\tSo overall you are winner");
                    }
                    else{
                        System.out.println("\tSo overall no one wins");
                    }
                    break;


                case "e":
                    x=5;
                    break;


            }

        x--;
        }
    }
}
