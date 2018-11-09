/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessingGameLictag;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-39
 */
public class GuessingGameLictag {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner nbr = new Scanner (System.in);
String a;
int z;
System.out.println("Please Enter A Number From 1-1000");
int x = nbr.nextInt();    

System.out.println("\n\n\n\n\n\n\n\n\n");

System.out.println("Guess A Number From 1-1000");
Scanner guess = new Scanner (System.in);
int y = guess.nextInt();
if (y == x) {
    System.out.print("Correct!");
}
else{
    if (y>1000)
    System.out.println("Input only a number from 1-1000");
if (x % 2 == 0){
        System.out.println("Wrong... Hint: the number is an even number");
    }
else{ System.out.println("Wrong... Hint: the number is an odd number");
}
z = guess.nextInt();
do{
    
if (z < x){
    System.out.println("Wrong... Hint: the number is higher than that");
    z = guess.nextInt();
}
else if (z > x){
    System.out.println("Wrong... Hint: the nunmber is lower than that");
    z = guess.nextInt();
}
if (z == x){
    System.out.println("Correct!");
}
}while(z!=x);
}
    }
}    

