
package prelim;
import java.util.Scanner;
public class Modesto_Lab_Exercise2 {
    public static void main(String[] args){
        Scanner GK = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int koy1 = GK.nextInt();
        
        System.out.println("Enter second number: ");
        int koy2 = GK.nextInt();
        
        System.out.println("Enter Third number: ");
        int koy3 = GK.nextInt();
        
        int greatest = koy1;
        
        if (koy2 > greatest){
            greatest = koy2;
            
        }
        
        if (koy3 > greatest){
            greatest = koy3;
            
        }
        
        System.out.println("The greatest number is: " + greatest);
        
        
        
    }
}
