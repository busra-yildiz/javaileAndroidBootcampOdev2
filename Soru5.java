public class Soru5 {
    public static void main(String[] args) {
        double uzunKenar = 5.0;
        double kisaKenar = 3.0;

        double alan = hesaplaDikdortgenAlani(uzunKenar, kisaKenar);

        System.out.println("Dikdörtgenin Alanı: " + alan);
    }

    public static double hesaplaDikdortgenAlani(double uzunKenar, double kisaKenar) {
        double alan = uzunKenar * kisaKenar;
        return alan;
    }

}
