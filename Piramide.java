
package piramide;
import java.util.Scanner;

public class Piramide {

    
    public static void main(String[] args) {
        Scanner nfilas= new Scanner (System.in);
        System.out.println("Ingrese el Numero de filas que desea");
       int filas=nfilas.nextInt();
    
  
       
        for (int i = 0; i <= filas; i++) {
            System.out.print("");
            for (int j = 0; j <= filas-i; j++) {
            }
            for (int k = 0; k < 1*i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
            
        }
    }
    

