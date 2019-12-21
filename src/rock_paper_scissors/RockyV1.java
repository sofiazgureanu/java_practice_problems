package rock_paper_scissors;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


    public class RockyV1 {

    public static void main(String[] args) {
        Scanner myMove = new Scanner(System.in);
        System.out.println("Hello! Welcome to Sofia's Rock, Paper, Scissors Game! Press any number from 0 to 2 to start. ");
        int move = myMove.nextInt();

       

        
        
        while (move <3){
          System.out.println("Rock(0), paper(1) or scissors(2)? To exit press 3");
        move = myMove.nextInt();
        if (move==0){System.out.println("user:rock ");}
        if (move==1){System.out.println("user:paper ");}
        if (move==2){System.out.println("user:scissors ");}
        Random random = new Random();
        int randInt3 = random.nextInt(3); 

        if (randInt3==0){System.out.println("computer:rock ");}
        if (randInt3==1){System.out.println("computer:paper ");}
        if (randInt3==2){System.out.println("computer:scissors ");}

        // System.out.println(randInt3);
        if (move == randInt3){
          System.out.println("It's a tie, oof");
        }
        if(move==0 && randInt3==1){
          System.out.println("You loose! NYEHEHEHEHEHEHE");
        }
        if(move==0 && randInt3==2){
          System.out.println("You win! Congrats");
        }
        if(move==1 && randInt3==0){
          System.out.println("You win! Congrats");
        }
        if(move==1 && randInt3==2){
          System.out.println("You loose! NYEHEHEHEHEHEHE");
        }
        if(move==2 && randInt3==0){
          System.out.println("You loose! NYEHEHEHEHEHEHE");
        }
        if(move==2 && randInt3==1){
          System.out.println("You win! Congrats");
        }
        }
    
       }
}
