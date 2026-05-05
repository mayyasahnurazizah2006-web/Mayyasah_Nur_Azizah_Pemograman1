import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        int hadir = 0;
        int maxHari = 21;
        double persen = 0;

        double tugas, uts, uas, total;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Cetak Data");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    do {
                        System.out.print("Masukkan jumlah kehadiran (max 21): ");
                        hadir = input.nextInt();

                        persen = (hadir / (double) maxHari) * 100;

                        if (persen < 75) {
                            System.out.println("Kehadiran kurang dari 75%, input ulang!");
                        }

                    } while (persen < 75);

                    // pengembangan tambahan
                    System.out.print("Nilai Tugas: ");
                    tugas = input.nextDouble();

                    System.out.print("Nilai UTS: ");
                    uts = input.nextDouble();

                    System.out.print("Nilai UAS: ");
                    uas = input.nextDouble();

                    total = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);

                    System.out.println("Total nilai: " + total);
                    break;

                case 2:
                    System.out.println("Kehadiran: " + hadir + " dari 21 hari");
                    System.out.println("Persentase: " + persen + "%");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (menu != 2);

        input.close();
    }
}