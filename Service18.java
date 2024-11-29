import java.util.Scanner;

public class Service18 {
    public static void main(String[] args) {
        // Konstanta untuk jarak servis dalam kilometer
        final double SERVICE_KECIL_KM = 9656.04;
        final double SERVICE_BESAR_KM = 19072.08;

        // Input dari pengguna
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak tempuh kendaraan Anda dalam km: ");
        double jarakTempuh = sc.nextDouble();

        // Tentukan servis berikutnya
        double jarakKeService;
        String jenisService;

        if (jarakTempuh % SERVICE_BESAR_KM == 0) {
            jarakKeService = SERVICE_BESAR_KM;
            jenisService = "besar";
        } else if (jarakTempuh % SERVICE_KECIL_KM == 0) {
            jarakKeService = SERVICE_KECIL_KM;
            jenisService = "kecil";
        } else if ((jarakTempuh % SERVICE_BESAR_KM) < (SERVICE_BESAR_KM - SERVICE_KECIL_KM)) {
            jarakKeService = SERVICE_BESAR_KM - (jarakTempuh % SERVICE_BESAR_KM);
            jenisService = "besar";
        } else {
            jarakKeService = SERVICE_KECIL_KM - (jarakTempuh % SERVICE_KECIL_KM);
            jenisService = "kecil";
        }

        // Tampilkan hasil
        System.out.println("Jarak hingga service berikutnya: " + String.format("%.2f", jarakKeService) + " km.");
        System.out.println("Jenis service berikutnya: " + jenisService + ".");
        
        sc.close();
    }
}