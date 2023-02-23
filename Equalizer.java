
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Eq5();
    }

    private static void Eq5() {
        eq();
        eq(12);
        eq();
        eq();
        eq();
        
        
    }

    private static void eq() {
        Random r = new Random();
        int db=r.nextInt(3,8);
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.println(szin+" ");
        }
//        igaze(szin);
    }

    private static void igaze(String szin) {
        boolean igaz = true;
        if (igaz==true) {
            System.out.print(szin.length());
        }
    }
    
    private static void eq(int hossz) {
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println();
    }

    
}
