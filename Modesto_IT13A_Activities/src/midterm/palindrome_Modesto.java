
package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class palindrome_Modesto {
      public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("enter gk boy: ");
        String koy1 = scanner.nextLine();
        
        System.out.print("enter gk girl: ");
        String koy2 = scanner.nextLine();
        
        System.out.print("enter gk gwapo: ");
        String koy3 = scanner.nextLine();
        
        checkPalindrome(koy1);
        checkPalindrome(koy2);
        checkPalindrome(koy3);
      
    }

   
    public static void checkPalindrome(String word) {
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }
}

