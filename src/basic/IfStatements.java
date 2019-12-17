package basic;
import java.util.Scanner;

public class IfStatements {
  public static void main(String[] args) throws Exception {
    // 1. Get number as input, print whether the number is greater than 2
    /*
    Test Input:
      2
    Expected Output:
      false
    */
    // Scanner myNum = new Scanner(System.in);
    // int num = myNum.nextInt();
    // System.out.println("Enter number");
    // if (num>2){
    //   System.out.println("greter than 2");
    
    // } else{
    //   System.out.println("not greter than 2");
    // }

    // 2. Get number as input, print whether the number is even
    /*
    Test Inputs:
      2
      3
    Expected Outputs:
      true
      false
    */
    
    // Scanner myNum2 = new Scanner(System.in);
    // int num1 = myNum2.nextInt();
    // System.out.println("Enter number");
    // if(num1%2==0){
    //   System.out.println("even");
    // } else{
    //   System.out.println("odd");
    // }

    // 3. Get 2 numbers as input, print whether the 2 numbers are equal to eachother
    /*
    Test Inputs:
      2
      3
      ...
      4
      4
    Expected Outputs:
      false
      ...
      true
    */

    Scanner myNum3 = new Scanner(System.in);
    System.out.println("Enter first number");
    int num2 = myNum3.nextInt(); 
    System.out.println("Enter second number");
    int num3 = myNum3.nextInt();
    if (num2 == num3){
      System.out.println("The numbers are equal");
    } else{
      System.out.println("The numbers not are equal");
    }

  }
}