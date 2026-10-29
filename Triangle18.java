import java.util.Scanner;

public class Triangle18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // 1. Segitiga Siku-siku Normal (Hasil Perbaikan Tahap 3)
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println(); // Memberi jarak spasi antar segitiga

        // 2. Segitiga Terbalik (Tambahan Langkah 8)
        i = n; // <--- Cukup tulis 'i = n;' tanpa kata 'int'
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; // <--- Menggunakan decrement karena nilainya dikurangi dari n ke 1
        }

        sc.close();
    }
}