import java.time.Year;
import java.util.Scanner;

class Nextdate {
    public static void main(String[] args) {

        // scanner
        Scanner scannerTahun = new Scanner(System.in);
        Scanner scannerBulan = new Scanner(System.in);
        Scanner scannerTanggal = new Scanner(System.in);
        Scanner scannerHKedepan = new Scanner(System.in);


        // input
        System.out.print("Tahun : ");
        int Tahun = scannerTahun.nextInt();
        System.out.print("Bulan : ");
        int Bulan = scannerBulan.nextInt();
        System.out.print("Tanggal : ");
        int Tanggal = scannerTanggal.nextInt();
        System.out.print("N hari kedepan : ");
        int HKedepan = scannerHKedepan.nextInt();
        int Besok = Tanggal + 1;
        // String namaBulan;
        // int t = HKedepan/365;
        // int SisaHari = HKedepan%365;
        // int TahunLeap = t/4;


        // proses
        if (Bulan == 1 && Besok <= 31) {
        System.out.println("Januari memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Januari " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Januari " + Tahun);
        }
        else if (Bulan == 1 && Besok > 31) {
        System.out.println("Januari memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Januari " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31)+ " Februari " + Tahun);
        }
        if (Bulan == 2 && Tahun%4 == 0 && Besok <= 29) {
        System.out.println("Februari memiliki hari sebanyak 29");
        System.out.println("Hari ini tanggal : " + Tanggal + " Februari " + Tahun);
        System.out.println("Besok tanggal : " + Besok+ " Februari " + Tahun);
        }
        else if (Bulan == 2 && Tahun%4 == 0 && Besok > 29) {
        System.out.println("Februari memiliki hari sebanyak 29");
        System.out.println("Hari ini tanggal : " + Tanggal + " Februari " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 29)+ " Maret " + Tahun);
        }
        if (Bulan == 2 && Tahun%4 != 0 && Besok <= 28) {
        System.out.println("Februari memiliki hari sebanyak 28");
        System.out.println("Hari ini tanggal : " + Tanggal + " Februari " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Februari " + Tahun);
        }
        else if (Bulan == 2 && Tahun%4 != 0 && Besok > 28) {
        System.out.println("Februari memiliki hari sebanyak 29");
        System.out.println("Hari ini tanggal : " + Tanggal + " Februari " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 28)+ " Maret " + Tahun);
        }

        if (Bulan == 3 && Besok <= 31) {
        System.out.println("Maret memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Maret " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Maret " + Tahun);
        }
        else if (Bulan == 3 && Besok > 31) {
        System.out.println("Maret memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Maret " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " April " + Tahun);
        }
        if (Bulan == 4 && Besok <= 30) {
        System.out.println("April memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " April " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " April " + Tahun);
        }
        else if (Bulan == 4 && Besok > 30) {
        System.out.println("April memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " April " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 30) + " Mei " + Tahun);
        }
        if (Bulan == 5 && Besok <= 31) {
        System.out.println("Mei memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Mei " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Mei " + Tahun);
        }
        else if (Bulan == 5 && Besok > 31) {
        System.out.println("Mei memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Mei " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " Juni " + Tahun);   
        }
        if (Bulan == 6 && Besok <= 30) {
        System.out.println("Juni memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " Juni " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Juni " + Tahun);
        }
        else if (Bulan == 6 && Besok > 30) {
        System.out.println("Juni memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " Juni " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 30) + " Juli " + Tahun);
        }
        if (Bulan == 7 && Besok <= 31) {
        System.out.println("Juli memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Juli " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Juli " + Tahun);
        }
        else if (Bulan == 7 && Besok > 31) {
        System.out.println("Juli memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Juli " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " Agustus " + Tahun);
        }
        if (Bulan == 8 && Besok <= 31) {
        System.out.println("Agustus memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Agustus " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Agustus " + Tahun);
        }
        else if (Bulan == 8 && Besok > 31) {
        System.out.println("Agustus memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Agustus " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " September " + Tahun);
        }
        if (Bulan == 9 && Besok <= 30) {
        System.out.println("September memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " September " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " September " + Tahun);
        }
        else if (Bulan == 9 && Besok <= 30) {
        System.out.println("September memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " September " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 30) + " Oktober " + Tahun);
        }
        if (Bulan == 10 && Besok <= 31) {
        System.out.println("Oktober memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Oktober " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Oktober " + Tahun);
        }
        else if (Bulan == 10 && Besok > 31) {
        System.out.println("Oktober memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Oktober " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " November " + Tahun);
        }
        if (Bulan == 11 && Besok <= 30) {
        System.out.println("November memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " November " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " November " + Tahun);
        }
        else if (Bulan == 11 && Besok > 30) {
        System.out.println("November memiliki hari sebanyak 30");
        System.out.println("Hari ini tanggal : " + Tanggal + " November " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 30) + " Desember " + Tahun);
        }
        if (Bulan == 12 && Besok <= 31) {
        System.out.println("Desember memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Desember " + Tahun);
        System.out.println("Besok tanggal : " + Besok + " Desember " + Tahun);
        }
        else if (Bulan == 12 && Besok > 31) {
        System.out.println("Desember memiliki hari sebanyak 31");
        System.out.println("Hari ini tanggal : " + Tanggal + " Desember " + Tahun);
        System.out.println("Besok tanggal : " + (Besok - 31) + " Januari " + (Tahun + 1));
        }
        if (Bulan > 12 || Tanggal > 31)
        System.out.println("Inputan tidak valid");

        
            
    
        

        

        int T = HKedepan/365;
        int TahunLeap = T/4;
        int SisaHari = HKedepan%365;
        SisaHari = SisaHari%365;
        int TanggalN = (Tanggal + SisaHari);
        int BKedepan = (Bulan + (TanggalN/30));
        
        

        if (Bulan == 2 && Tahun%4 != 0)
        System.out.println(HKedepan + " hari lagi tanggal : " + (TanggalN%365%334%304%273%243%212%181%151%120%90%59%28) + "/" + (BKedepan) + "/" + (Tahun + T));
        if (Bulan == 2 && Tahun%4 == 0)
        System.out.println(HKedepan + " hari lagi tanggal : " + (TanggalN%365%334%304%273%243%212%181%151%120%90%59%29) + "/" + (BKedepan) + "/" + (Tahun + T));
        if (Bulan != 2)
        System.out.println(HKedepan + " hari lagi tanggal : " + (TanggalN%365%334%304%273%243%212%181%151%120%90%59%31%30) + "/" + (BKedepan) + "/" + (Tahun + T));
        
    }

}