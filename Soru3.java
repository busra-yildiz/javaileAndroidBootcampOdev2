public class Soru3 {
        public static double hesaplaOtoparkUcreti(int otoparkSuresi) {
            double ucret = 0;
            double saatlikUcret = 50.0;

            if (otoparkSuresi <= 0) {
                ucret = 0;
            } else if (otoparkSuresi <= 60) {
                ucret = saatlikUcret;
            } else {
                int ekSaat = (otoparkSuresi - 60) / 60;
                ucret = saatlikUcret + (ekSaat * 10);
            }

            return ucret;
        }

        public static void main(String[] args) {
            int otoparkSuresi = 120;
            double ucret = hesaplaOtoparkUcreti(otoparkSuresi);
            System.out.println(otoparkSuresi + " dakika için otopark ücreti: " + ucret + " TL");
        }
    }


