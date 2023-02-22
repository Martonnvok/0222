


public class elozoOrai {
    public static void main(String[] args) {
//       int osszeg=elso10SzamOsszege();
//       String s = String.format("Az első 10 szám összege: %d", osszeg );
//       kiir(s+"\n");
//       
//       int a = 7, b = 14;
//        osszeg = ossze(a, b);
//        s = String.format("%d + %d = %d\n", a, b, a + b);
//        kiir(s);

        int osszeg4 = 0;
        for (int i = 0; i < 4; i++) {
            osszeg4 += i;
        }
        String s2 = String.format("Az első 4 szám összege: %d", osszeg4 );
        kiir(s2+"\n");

    }

    
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int ossze(int a, int b) {
        return a + b;
    }
    
    private static void kiir(String str){
        System.out.print(str);
    }
}
