public class Soru7 {

    public static int sayEHarfi(String kelime) {
        int eHarfSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E') {
                eHarfSayisi++;
            }
        }

        return eHarfSayisi;
    }

    public static void main(String[] args) {
        String kelime = "Sevgilim Alaeddin";
        int eHarfSayisi = sayEHarfi(kelime);

        System.out.println("Kelime içinde " + eHarfSayisi + " adet 'e' harfi bulunuyor.");
    }

}
