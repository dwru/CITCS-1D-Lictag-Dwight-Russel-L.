package fib;

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        display();
    }
public static void display() {
Scanner sc = new Scanner(System.in);
 System.out.println("SELECT AN OPERATION" );
 System.out.println("Choose from the following:FACTORIAL or FIBONACCI (can be lower case or upper case)");
 String choosen = sc.next();

 while(!choosen.equalsIgnoreCase("factorial") && !choosen.equalsIgnoreCase("fibonacci")) {
     System.out.println("options are factorial/fibonacci only");
     sc = new Scanner(System.in);
     choosen = sc.next();
 }

 System.out.println("ENTER THE SIZE OF ARRAY: ");

 int arrSize = sc.nextInt();
 int[] arr = new int[arrSize];

 System.out.println("ENTER THE ELEMENTS: ");
 for (int i = 0; i< arr.length; i++){
 arr[i] = sc.nextInt(); }

 if (choosen.equalsIgnoreCase("factorial")) {
         for (int i = 0; i < arr.length; i++) {
          System.out.print("f(" + arr[i] + ")\t");
         }
         System.out.print("\n");
         for (int i = 0; i < arr.length; i++) {
         System.out.print(fact(arr[i]) + "\t");
         }
     } else if (choosen.equalsIgnoreCase("fibonacci")) {
         for (int i = 0; i < arr.length; i++) {
         System.out.print("f(" + arr[i] + ")\t");
         }
         System.out.print("\n");
         for (int i = 0; i < arr.length; i++) {
         System.out.print(fib(arr[i] + 1) + "\t");
         }         
} 
   }  public static int fact(int n) {
    if (n <= 0) {
    return 1;
    }else {
    return n * fact(n-1);
    }
}

public static int fib(int n) {
    if (n < 0) {
     return 0;
    } else if (n == 0 || n == 1) {
      return n;
    } else {
      return fib(n-2) + fib(n-1);
    }
  } 
} 

