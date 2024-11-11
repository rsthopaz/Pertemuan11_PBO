import java.util.ArrayList;

public class RentalMobil {

    public static void main(String[] args) {
        // Membuat daftar mobil
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        // Menambahkan mobil yang tersedia
        daftarMobil.add(new MobilTersedia("Toyota Avanza", "MPV"));
        daftarMobil.add(new MobilTersedia("Honda Jazz", "Hatchback"));
        daftarMobil.add(new MobilTersedia("Daihatsu Xenia", "MPV"));

        // Menambahkan mobil yang disewa
        daftarMobil.add(new MobilDisewa("Suzuki Ertiga", "MPV", "Budi"));
        daftarMobil.add(new MobilDisewa("Nissan X-Trail", "SUV", "Siti"));

        // Menampilkan daftar mobil yang tersedia
        System.out.println("Daftar Mobil Tersedia:");
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilTersedia) {
                mobil.tampilkanInfo();
            }
        }

        System.out.println("\nDaftar Mobil Disewa:");
        // Menampilkan daftar mobil yang disewa
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilDisewa) {
                mobil.tampilkanInfo();
            }
        }
    }
}
