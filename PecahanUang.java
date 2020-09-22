import java.util.Scanner;

class PemecahUangRupiah {
    public static void main(String[] args) {
        
        // nambah scanner
         Scanner scannerUang = new Scanner(System.in);
        
        // input
        System.out.print("Nilai: ");
        int uang = scannerUang.nextInt();
    
        // proses
        int hitung = (int)(uang/100000);
        int sisa = (int)(uang%100000);
        System.out.println(hitung + " lembar pecahan 100000");

        hitung = (int)(sisa/50000);
        sisa = (int)(sisa%50000);
        System.out.println(hitung + " lembar pecahan 50000");

        hitung = (int)(sisa/20000);
        sisa = (int)(sisa%20000);
        System.out.println(hitung + " lembar pecahan 20000");

        hitung = (int)(sisa/10000);
        sisa = (int)(sisa%10000);
        System.out.println(hitung + " lembar pecahan 10000");

        hitung = (int)(sisa/5000);
        sisa = (int)(sisa%5000);
        System.out.println(hitung + " lembar pecahan 5000");

        hitung = (int)(sisa/2000);
        sisa = (int)(sisa%2000);
        System.out.println(hitung + " lembar pecahan 2000");

        hitung = (int)(sisa/1000);
        sisa = (int)(sisa%1000);
        System.out.println(hitung + " lembar pecahan 1000");

        hitung = (int)(sisa/500);
        sisa = (int)(sisa%500);
        System.out.println(hitung + " keping pecahan 500");

        hitung = (int)(sisa/200);
        sisa = (int)(sisa%200);
        System.out.println(hitung + " keping pecahan 200");

        hitung = (int)(sisa/100);
        sisa = (int)(sisa%100);
        System.out.println(hitung + " keping pecahan 100");

        hitung = (int)(sisa/50);
        sisa = (int)(sisa%50);
        System.out.println(hitung + " keping pecahan 50");

        hitung = (int)(sisa/1);
        sisa = (int)(sisa%1);
        System.out.println(hitung + " keping pecahan sen");
        
        
    }
}