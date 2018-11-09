/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OddEvenArrayTableLictag;
/**
 *
 * @author cc2_1d-39
 */
public class OddEvenArrayTableLictag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
     int nbr[] = {3 ,9 ,15 ,20 ,65 ,23 ,18 ,4 ,2 ,14 };
     
    
     
     int[] odd = new int[nbr.length];
     int[] even = new int[nbr.length];
     
     int oddn = 0;
     int evenn = 0;
     
     for (int n = 0; n< nbr.length; n++){
     
     if (nbr[n]% 2==0){
         even [evenn]=nbr[n];
         evenn++;
                 
         
     }else{
         odd[oddn] = nbr[n]; 
         oddn++;
         
     }
     }
    
      System.out.println("Odd \t Even");
         for (int n = 0; n < oddn; n++){
        System.out.println(odd[n] +"\t"+ even[n]);
         }
    }
}
     

       


