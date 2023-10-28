public class IkinciOdev {
    //1. soru
    public static double hesaplaIcAci(int kenarSayisi) {
        if (kenarSayisi < 3) {
            System.out.println("Kenar sayısı 3'ten küçük olamaz.");
            return -1.0;
        }
        double toplamIcAci = (kenarSayisi - 2) * 180;

        double herBirIcAci = toplamIcAci / kenarSayisi;

        return herBirIcAci;
    }

    public static void main(String[] args) {
        int kenarSayisi = 5;
        double icAci = hesaplaIcAci(kenarSayisi);
        if (icAci != -1.0) {
            System.out.println(kenarSayisi + " kenarlı çokgenin her bir iç açısı: " + icAci + " derece");
        }
    }


}


