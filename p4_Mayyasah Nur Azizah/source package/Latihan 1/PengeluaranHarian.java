import java.util.Scanner;

public class PengeluaranHarian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data awal (sesuai gambar)
        double makan = 20000;
        double transport = 10000;
        double belanja = 50000;

        double total = makan + transport + belanja;

        System.out.println("=== Perhitungan Awal ===");
        System.out.println("Total = " + total);

        double persenMakan = (makan / total) * 100;
        double persenTransport = (transport / total) * 100;
        double persenBelanja = (belanja / total) * 100;

        System.out.println("Makan = " + persenMakan + "%");
        System.out.println("Transport = " + persenTransport + "%");
        System.out.println("Belanja = " + persenBelanja + "%");

        // ================================
        // Tambahan: Pengeluaran 7 hari
        // ================================
        double[] pengeluaran = new double[7];
        double totalMingguan = 0;

        System.out.println("\n=== Input Pengeluaran 7 Hari ===");

        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i + 1) + " : ");
            pengeluaran[i] = input.nextDouble();
            totalMingguan += pengeluaran[i];
        }

        System.out.println("\n=== Hasil Pengeluaran 7 Hari ===");
        System.out.println("Total Pengeluaran Mingguan = " + totalMingguan);

        System.out.println("\nPersentase per hari:");
        for (int i = 0; i < 7; i++) {
            double persen = (pengeluaran[i] / totalMingguan) * 100;
            System.out.println("Hari ke-" + (i + 1) + " = " + persen + "%");
        }

        input.close();
    }
}