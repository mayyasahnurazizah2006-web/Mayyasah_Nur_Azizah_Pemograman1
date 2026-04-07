import java.util.Scanner;

public class PenghitungNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kehadiran = inputKehadiran(scanner);
        double bobotKehadiran = inputBobot(scanner, "Kehadiran");
        double bobotTugas = inputBobot(scanner, "Tugas");
        double bobotUTS = inputBobot(scanner, "UTS");
        double bobotUAS = inputBobot(scanner, "UAS");

        // Validasi total bobot
        double totalBobot = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;
        if (Math.abs(totalBobot - 100) > 0.01) {
            System.out.println("Error: Total bobot harus 100%!");
            return;
        }

        System.out.println("\n--- Input Nilai ---");
        double nilaiTugas = inputNilai(scanner, "Tugas");
        double nilaiUTS = inputNilai(scanner, "UTS");
        double nilaiUAS = inputNilai(scanner, "UAS");

        double nilaiKehadiran = (double) kehadiran / 21 * 100;

        double nilaiAkhir = (nilaiKehadiran * bobotKehadiran / 100) +
                            (nilaiTugas * bobotTugas / 100) +
                            (nilaiUTS * bobotUTS / 100) +
                            (nilaiUAS * bobotUAS / 100);

        tampilkanHasil(kehadiran, nilaiKehadiran, bobotKehadiran,
                       nilaiTugas, bobotTugas,
                       nilaiUTS, bobotUTS,
                       nilaiUAS, bobotUAS,
                       nilaiAkhir);

        System.out.println("GRADE         : " + getGrade(nilaiAkhir));

        scanner.close();
    }

    // ================= FUNCTION =================

    private static int inputKehadiran(Scanner scanner) {
        int kehadiran;
        do {
            System.out.print("Masukkan jumlah kehadiran (0-21): ");
            kehadiran = scanner.nextInt();
            if (kehadiran < 0 || kehadiran > 21) {
                System.out.println("Input tidak valid!");
            }
        } while (kehadiran < 0 || kehadiran > 21);
        return kehadiran;
    }

    private static double inputBobot(Scanner scanner, String jenis) {
        double bobot;
        do {
            System.out.print("Masukkan bobot " + jenis + " (%): ");
            bobot = scanner.nextDouble();
            if (bobot < 0 || bobot > 100) {
                System.out.println("Bobot harus 0-100!");
            }
        } while (bobot < 0 || bobot > 100);
        return bobot;
    }

    private static double inputNilai(Scanner scanner, String jenis) {
        double nilai;
        do {
            System.out.print("Masukkan nilai " + jenis + " (0-100): ");
            nilai = scanner.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus 0-100!");
            }
        } while (nilai < 0 || nilai > 100);
        return nilai;
    }

    private static void tampilkanHasil(int kehadiran, double nilaiKehadiran, double bobotKehadiran,
                                      double nilaiTugas, double bobotTugas,
                                      double nilaiUTS, double bobotUTS,
                                      double nilaiUAS, double bobotUAS,
                                      double nilaiAkhir) {

        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.printf("Kehadiran : %d/21 = %.1f%% -> %.2f\n",
                kehadiran, nilaiKehadiran, nilaiKehadiran * bobotKehadiran / 100);
        System.out.printf("Tugas     : %.1f%% -> %.2f\n",
                nilaiTugas, nilaiTugas * bobotTugas / 100);
        System.out.printf("UTS       : %.1f%% -> %.2f\n",
                nilaiUTS, nilaiUTS * bobotUTS / 100);
        System.out.printf("UAS       : %.1f%% -> %.2f\n",
                nilaiUAS, nilaiUAS * bobotUAS / 100);
        System.out.println("================================");
        System.out.printf("TOTAL NILAI : %.2f\n", nilaiAkhir);
    }

    private static String getGrade(double nilai) {
        if (nilai >= 90) return "A";
        else if (nilai >= 80) return "B";
        else if (nilai >= 70) return "C";
        else if (nilai >= 60) return "D";
        else return "E";
    }
}