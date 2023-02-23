
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Eq5();
    }

    private static void Eq5() {
        eq(8);
        System.out.println(" ");
        eq(1);
//        eq();
//        eq();
//        eq();
        
        
    }

//    private static void eq() {
//        Random r = new Random();
//        int db=r.nextInt(3,8);
//        
//        for (int i = 0; i < db; i++) {
//            String szin = "\u001B[45m";
//            System.out.println(szin+" ");
//        }
//    }

   
    
    private static void eq(int hossz) {
         Random r = new Random();
        for (int i = 0; i < hossz; i++) {
         int szam = r.nextInt (3,8);
         String szin ="\u001B[45m";
          for (int j = 0; j < szam; j++) {
               System.out.print( szin + " ");
        }
          System.out.println("");
    }

    }
}
