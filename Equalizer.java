
import java.util.Random;

public class Equalizer {
    static Random r = new Random();
    public static void main(String[] args) {
        Eq5();
    }

    private static void Eq5() {
        eq(8,true);
        eq(false);
        eq(12,true);
        eq();
        eq(true);
        
        
    }

   

     private static void eq(){
        int hossz = r.nextInt(3,8);
        eq(hossz,false);
    }
    
    private static void eq(int hossz){
        eq(hossz,false);
    }
    
    private static void eq(boolean szamol){
        int hossz = r.nextInt(3,8);
        eq(hossz,szamol);
    }
    
    private static void eq(int hossz, boolean szamol){
        for (int i = 0; i < hossz; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        if (szamol) {
            System.out.print("\u001B[40m" + " ");
            System.out.print(hossz);
        }
        System.out.println();
    }

}
