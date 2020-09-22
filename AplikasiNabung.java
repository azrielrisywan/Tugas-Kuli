import java.util.Scanner;
import java.util.scanner;

class AplikasiNabung {
    public static void main(String[] args) {

    // scanner
    Scanner inputUang = new Scanner(System.in);
    Scanner inputHari = new Scanner(System.in);
    // inputan
    System.out.print("Jumlah Uang :");
    int Uang = inputUang.nextInt();
    System.out.print("Hari : ");
    int Hari = inputHari.nextInt();
    // proses
    int hitung = (int)(Uang * Hari);
    System.out.println("Rp " + hitung + " Rupiah");
    }
}