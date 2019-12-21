package basic;
// https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://www.geeksforgeeks.org/java-math-random-method-examples/
// https://www.geeksforgeeks.org/random-setseed-method-in-java-with-examples/

// use these links to learn more about random numbers
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

// hint
// use Math library for now

public class RandomNumbers {
  public static void testProblem() {
    System.out.println("Do you believe in me?");
  }
  public static void main(String[] args) throws Exception {
    // testProblem();

  //   // 1. Generate a random number and print to screen.
    Random rand = new Random();
    int randInt1 = rand.nextInt(100); 
    System.out.println(randInt1);

  //   // 2. Generate a random number between 1 and 3. print that number.
    Random rand1 = new Random();
    int randInt4 = rand1.nextInt(3); 
    randInt4 = (randInt4 + 1);
    System.out.println(randInt4);
     
  //   // 3. Mental Health Therapist program:
  //   // Ask usere for their name?
  //   // random print "I believe in you!" or "You suck!"
    
    Scanner myName = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = myName.nextLine();
    Random rand3 = new Random();
    int randInt2 = rand3.nextInt(2); 
    if (randInt2==0){
      System.out.println("I believe in you!");
    }else{
      System.out.println("You suck!");
    }

  //   // 4. Get user input, print matching string to number
  //   // 1 -> "rock", 2 -> "paper", 3 -> "scissors"
    
    Scanner myMove = new Scanner(System.in);
    System.out.println("Press any number from 0 to 2 to start");
    int move = myMove.nextInt();

    while (move <3){
      System.out.println("Rock(0), paper(1) or scissors(2)? To exit press 3");
    move = myMove.nextInt();
    Random random = new Random();
    int randInt3 = random.nextInt(3); 
    System.out.println(randInt3);
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

    // 5. Set a seed "seed value".
    // Randomly generate a number.
    // Run program 4 times to ensure that it generates the same number each time.

     long s = 24; 
    Random r = new Random(); 
    r.setSeed(s);
    
    System.out.println("Random Integer value : " + r.nextInt()); 

    System.out.println("Random Integer value : " + r.nextInt()); 
  }
}
