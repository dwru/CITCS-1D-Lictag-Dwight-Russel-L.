/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorLictag;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-39
 */
public class CalculatorLictag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nbr = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = nbr.nextInt();
        System.out.println("Enter Second Number");
        int y = nbr.nextInt();
        System.out.println("Enter Operation");
        String operation = nbr.next();
        int c;
        switch (operation){
            case "*":
                System.out.println(x*y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "+":
                System.out.println(x+y);
                break;
            case "/":
                System.out.println(x/y);
                break;
        }
    }
    
}
