import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String nama;
        Integer NIM; 
        String Alamat;
        String Nama_Ortu;
        int usia;

        System.out.println("---------------------");

        System.out.print("input nama : ");
        nama = input.nextLine();

        System.out.print("input NIM : ");
        NIM = input.nextInt();

        System.out.print("input Alamat : ");
        Alamat = input.nextLine();

        System.out.print("input Nama Ortu : ");
        Nama_Ortu = input.nextLine();

        System.out.print("input Usia : ");
        usia = input.nextInt();

        System.out.println("\n----- HASIL -----");
        System.out.println("Nama       : " + nama);
        System.out.println("NIM        : " + NIM);
        System.out.println("Alamat     : " + Alamat);
        System.out.println("Nama Ortu  : " + Nama_Ortu);
        System.out.println("Usia       : " + usia);

        input.close();
    }
}