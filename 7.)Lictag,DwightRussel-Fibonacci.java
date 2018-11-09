package javmethod;
import java.util.*;
public class JavMethod {

        // *FINAL ACT* //
        public static void main(String[] args) {
            Scanner etc = new Scanner(System.in);
            System.out.println("Enter Value/s:");
            int Etc = etc.nextInt();
            display(Etc);
        }
        static int Fibonnacci(int n){
        if(n == 0){
            return 0;
        }else if( n ==1 ){
            return 1;
        }else if ( n > 1){
            return (Fibonnacci(n-1)+Fibonnacci(n-2));
        }   else return 0;
}
        public static void display(int num){
            for (int j = 1; j <= num;j++){
                System.out.print("f("+j+")\t");}
            for (int n =0; n <= num ; n++){
                for (int j = 0; j < n; j++){                    
              System.out.print(Fibonnacci (j) + "\t");
            } System.out.print("\n\n");
        }
    }
}        