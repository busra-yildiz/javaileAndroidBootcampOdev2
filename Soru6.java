public class Soru6 {
    public static long hesaplaFaktoriyel(int sayi) {
        if (sayi < 0) {
            throw new IllegalArgumentException("Negatif sayıların faktoriyeli hesaplanamaz.");
        }
        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    public static void main(String[] args) {
        int girilenSayi = 5;
        long sonuc = hesaplaFaktoriyel(girilenSayi);
        System.out.println(girilenSayi + " sayısının faktoriyeli: " + sonuc);
    }

}
