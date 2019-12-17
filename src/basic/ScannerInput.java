package basic;
import java.util.Scanner;

// https://www.w3schools.com/java/java_user_input.asp
// use this link as a tutorial on how to use the Scanner class to get user input.

public class ScannerInput {
  public static void main(String[] args) throws Exception {
    // 1. Write a Java program that takes two numbers as input and display the product of two numbers.
    /*
    Test Data:
      Input first number: 25
      Input second number: 5
    Expected Output:25
      25 x 5 = 125
    */

    Scanner myNum = new Scanner(System.in);  
    System.out.println("Enter first number");
    int num1 = myNum.nextInt(); 
    System.out.println("Enter second number");
    int num2 = myNum.nextInt();
    System.out.println("First number " + num1);
    System.out.println("Second number " + num2);
    int result = num1*num2;
    System.out.println("Result " + result);





    // 2. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    /*
    Test Data:
      Input first number: 125
      Input second number: 24
    Expected Output :
      125 + 24 = 149
      125 - 24 = 101
      125 x 24 = 3000
      125 / 24 = 5
      125 mod 24 = 5
    */

    Scanner myNum2 = new Scanner(System.in);
    System.out.println("Enter first number");
    int num3 = myNum2.nextInt(); 
    System.out.println("Enter second number");
    int num4 = myNum2.nextInt();
    int resultAddition = num3+num4;
    int resultSubtraction = num3-num4;
    int resultMultiplication = num3*num4;
    int resultDivision = num3/num4;
    int resultRemainder = num3 % num4;
    System.out.println("Result addition " + resultAddition);
    System.out.println("Result subtracion " + resultSubtraction);
    System.out.println("Result multiplication " + resultMultiplication);
    System.out.println("Result division " + resultDivision);
    System.out.println("Result remainder " + resultRemainder);


    // 3. Write a Java program that takes a number as input and prints its multiplication table upto 10.
    /*
    Test Data:
      Input a number: 8
    Expected Output:
      8 x 1 = 8
      8 x 2 = 16
      8 x 3 = 24
      ...
      8 x 10 = 80
    */
    Scanner myNum3 = new Scanner(System.in);
    System.out.println("Enter number");
    int num5 = myNum3.nextInt(); 
    int num6;
    System.out.println("Multiplication table:");
    for(int i=1;i<=10;i++){  
      num6 = num5*i;
      System.out.println(num5 + " x " +i + " = " + num6);  
      }  
    

    // 4. Write a Java program to display the following pattern.
    /*
      Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
    */


  }
}