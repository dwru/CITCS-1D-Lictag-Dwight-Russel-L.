/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayTableLictag;
import java.util.Scanner;
/**
 *
 * @author CC2_1D-39
 */
public class ArrayTableLictag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
    Scanner x = new Scanner (System.in);
    
     int rows;
     
     int columns;
     
     System.out.println("Enter Row Size:");
     
        rows = x.nextInt();
      
        int [][] lmnts = new int[rows][];
             
        int nbr;
        
        System.out.println("Enter Column Size:");
            
            columns = x.nextInt();
            
              System.out.println("-------------------------------");
            
        for (int i = 0; i < rows; i++){
            
            lmnts[i] = new int[columns];
            
            for (int j = 0; j < columns; j++){
                
            System.out.print("Row " + i + "\tColumn " + j +":\t");
            
            nbr = x.nextInt();
            
            
            lmnts[i][j] = nbr;
            
            }
            
        }
        
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
       
        for (int i = 0; i < lmnts.length; i++){
            
        for (int j = 0; j < lmnts.length; j++){
            
            System.out.print(lmnts[i][j] + "\t");
        }
        System.out.println("\n");
          System.out.println("\n");
        }
        
        }
        }
    

