public class Soru4 {
        public static double convertKmToMile(double km) {
            double mile = km * 0.621;
            return mile;
        }

        public static void main(String[] args) {
            double km = 10.0;
            double mile = convertKmToMile(km);
            System.out.println(km + " kilometre " + mile + " mil eder.");
        }
    }

