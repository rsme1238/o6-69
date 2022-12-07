
package ornek6.pkg69;

import java.util.Scanner;

public class Ornek669 {

   
    public static void main(String[] args) {
       
          Scanner input = new Scanner(System.in);
        
        int n,is;
        double x, f, t, aci;

         System.out.println("Aci degeri (derece): ");
          aci = input.nextDouble();
      
        System.out.println("Terim sayisi: ");
          n= input.nextInt();
        
        
          
           t= 1;
           x=Math.toRadians(aci);
           is=1;
          
    
          
          for(int i=1; i<=n-1; i++){
          
                f=1; 
               for(int j=1; j< 2*i; j++){
                 f*= j;
                 is*=(-1);
                 t+= is *  Math.pow(x, 2*i)/f;
               } 
          }
          
          System.out.printf("\nSeri acilimi ile hesaplanan  deger: %.5f\n", t);
          
        
    }
    
}
