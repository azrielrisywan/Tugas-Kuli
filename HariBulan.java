import java.util.Scanner;

class HariBulan {
    public static void main(String[] args) {

        // scanner
        Scanner scannerHariBulan = new Scanner(System.in);
        Scanner scannerHariTahun = new Scanner(System.in);

        // input
        System.out.print("Bulan : ");
        int Bulan = scannerHariBulan.nextInt();
        System.out.print("Tahun : ");
        int Tahun = scannerHariTahun.nextInt();

        // proses
        if (Bulan == 1)
        System.out.println("Januari " + Tahun + " memiliki 31 hari");
        if (Bulan == 2 && Tahun%4 == 0)
        System.out.println("Februari " + Tahun + " memiliki 29 hari");
        if (Bulan == 2 && Tahun%4 != 0)
        System.out.println("Februari " + Tahun + " memiliki 28 hari");
        if (Bulan == 3)
        System.out.println("Maret " + Tahun + " memiliki 31 hari");
        if (Bulan == 4)
        System.out.println("April " + Tahun + " memiliki 30 hari");
        if (Bulan == 5)
        System.out.println("Mei " + Tahun + " memiliki 31 hari");
        if (Bulan == 6)
        System.out.println("Juni " + Tahun + " memiliki 30 hari");
        if (Bulan == 7)
        System.out.println("Juli " + Tahun + " memiliki 31 hari");
        if (Bulan == 8)
        System.out.println("Agustus " + Tahun + " memiliki 31 hari");
        if (Bulan == 9)
        System.out.println("September " + Tahun + " memiliki 30 hari");
        if (Bulan == 10)
        System.out.println("Oktober " + Tahun + " memiliki 31 hari");
        if (Bulan == 11)
        System.out.println("November " + Tahun + " memiliki 30 hari");
        if (Bulan == 12)
        System.out.println("Desember " + Tahun + " memiliki 31 hari");
        if (Bulan > 12)
        System.out.println("Inputan tidak valid");

    }
}