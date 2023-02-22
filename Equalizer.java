
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Eq5();
    }

    private static void Eq5() {
        eq();
        eq();
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
        System.out.println("");
    }

    
}
