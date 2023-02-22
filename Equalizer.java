
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Random r = new Random();
        String s = String.format("\u001B[45m" );
        for (int i = 0; i < 5; i++) {
            int szam = r.nextInt(3,7);
            if (szam == 3) {
                kiir(s+"   ");
            }
            else if (szam == 4) {
                kiir(s+"    ");
            }
            else if (szam == 5) {
                kiir(s+"     ");
            }
            else if (szam == 6) {
               kiir(s+"      ");
            }
            else if (szam == 7) {
               kiir(s+"       ");
            }
            
        }
    }

    private static void kiir(String str) {
        System.out.println(str);
    }
}
