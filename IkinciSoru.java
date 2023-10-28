public class IkinciSoru {
    public double hesaplaMaas(int gunSayisi) {
        int calismaSaati = gunSayisi * 8;
        double calismaSaatUcreti = 40.0;
        double mesaiSaatUcreti = 80.0;
        double maas = 0.0;
        if (calismaSaati <= 150) {
            maas = calismaSaati * calismaSaatUcreti;
        } else {
            maas = 150 * calismaSaatUcreti + (calismaSaati - 150) * mesaiSaatUcreti;
        }
        return maas;
    }

    public static void main(String[] args) {
        IkinciSoru ikinciOdev = new IkinciSoru ();
        int gunSayisi = 20;
        double maas = ikinciOdev.hesaplaMaas(gunSayisi);
        System.out.println(gunSayisi + " gün çalışmanın sonucunda elde edilen maaş: " + maas + " TL");
    }

}
