package basic;

public class MathOperators {
  public static void main(String[] args) throws Exception {
    // 1. Write a Java program to print the sum of two numbers.
    /*
    Test Data:
      74 + 36
    Expected Output :
      110
    */
    
      
    int a = 74;
    int b = 36;
    int c;
    c=a+b;
    System.out.println(c);

    // 2. Write a Java program to divide two numbers and print on the screen.
    /*
    Test Data :
      50/3
    Expected Output :
      16
    */

    int d = 50;
    int e = 3;
    int f;
    f=d/e;
    System.out.println(f);

    // 3. Write a Java program to print the result of the following operations.

    /*
    Test Data:
      a. -5 + 8 * 6
      b. (55+9) % 9
      c. 20 + -3*5 / 8
      d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output:
      43
      1
      19
      13
    */
    //a. -5 + 8 * 6
    int g= -5;
    int h= 8;
    int i= 6;
    int j;
    j = g+h*i;
    System.out.println(j);
    //b. (55+9) % 9
    int k=55;
    int l=9;
    int m=9;
    int n;
    n=(k+l)%m;
    System.out.println(n);
    //c. 20 + -3*5 / 8
    int o=20;
    int p= -3;
    int q= 5;
    int r=8;
    int s;
    s= o + p * q/r;
    System.out.println(s);
    //d. 5 + 15 / 3 * 2 - 8 % 3
    int t=5;
    int u=15;
    int v= 3;
    int w=2;
    int x=8;
    int y=3;
    int z;
    z=t+u/v*w-x%y;
    System.out.println(z);

  }
}