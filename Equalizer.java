
import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int szam = r.nextInt(3,7);
            if (szam == 3) {
                System.out.println("\u001B[45m" + " "+ " "+ " ");
            }
            else if (szam == 4) {
                System.out.println("\u001B[45m" + " "+ " "+ " "+ " ");
            }
            else if (szam == 5) {
                System.out.println("\u001B[45m" + " "+ " "+ " "+ " "+ " ");
            }
            else if (szam == 6) {
               System.out.println("\u001B[45m" + " "+ " "+ " "+ " "+ " "+ " "); 
            }
            else if (szam == 7) {
               System.out.println("\u001B[45m" + " "+ " "+ " "+ " "+ " "+ " "+ " "); 
            }
            
        }
    }
}
