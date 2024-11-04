public class SaldoTabungan {

    public static void main(String[] args) {
        // Menjalankan fungsi untuk menghitung saldo setiap bulan
        hitungSaldo();
    }

    // Fungsi untuk menghitung saldo setiap bulan
    public static void hitungSaldo() {
        double saldo = 2875000; // Saldo awal
        double bunga = 0.15; // Tingkat bunga 15%

        for (int bulan = 1; bulan <= 6; bulan++) {
            System.out.printf("Saldo di bulan ke-%d Rp.%.0f%n", bulan, saldo);
            saldo += saldo * bunga; // Menghitung saldo bulan berikutnya
        }
    }
}