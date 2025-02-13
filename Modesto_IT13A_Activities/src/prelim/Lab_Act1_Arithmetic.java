package Prelim;

public class Lab_Act1_Arithmetic {
    public static void main(String[] org){
        
        int koy1 = 10;
        int gk2 = 6;
        int toks3 = 4;
        int gankris4 = 3;
        
        int show1 = koy1 * toks3 + gk2;
        int backup1 = koy1 - toks3;
        int show2 = backup1 % gk2;
        int backup2 = koy1 + toks3 + gk2;
        int show3 = backup2 / gankris4;
        int backup3 = toks3 * toks3;
        int show4 = koy1 * gk2 - backup3;
        
          System.out.println(" 10 * 4 + 6 = "+show1);
         System.out.println("(10-4) % 6 = "+show2);
            System.out.println("(10 + 4 + 6)/3 = "+show3);
               System.out.println("10 * 6 -(4 * 4 ) = "+show4);
               
          
}
}