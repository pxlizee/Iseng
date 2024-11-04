import java.util.Scanner;

public class ProgramBelanjaBuah {

    private static final int Jumlah = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Daftar Harga Buah
        String[] namaBuah = {"Apel", "Jeruk", "Mangga", "Stroberi", "Anggur"};
        int[] hargaBuah = {10000, 15000, 20000, 12000,  18000};

        //Keranjang Belanja
        int[] jumlahBeli = new int[namaBuah.length];

        // Menu Utama
        System.out.println("Menu: ");
        System.out.println("1. Beli Buah");
        System.out.println("2. Struk Belanja");
        System.out.println("3. Keluar");

        //Proses Belanja
        boolean lanjutBelanja = true;
        while (lanjutBelanja) {
            //input pilihan buah
            System.out.println("Masukkan Pilihan: ");
            int pilihanBuah = scanner.nextInt();

            //input jumlla buah
            System.out.println("Pilih Buah (0-4): ");
            int namaBuahIndex = scanner.nextInt();

            //simpan jumlah beli
            jumlahBeli[pilihanBuah - 1] += Jumlah;

            //tanyakan Lanjut apa nggak
            System.out.println("input lagi? (y/n): ");
            String inputLanjut = scanner.next();
            lanjutBelanja = inputLanjut.equalsIgnoreCase("y");
        }

        // cetak struk belanja
        System.out.println("\nDaftar Belanja:");
        System.out.println("============================");
        System.out.println("No. Nama Buah\tJumlah\tHarga\tSubtotal");
        System.out.println("============================");

        //hitung total
        int total = 0;
        for (int i = 0; i < namaBuah.length; i++) {
            int subtotal = jumlahBeli[i] * hargaBuah[i];
            System.out.println((i + 1) + ". " + namaBuah[i] + "\t" + jumlahBeli[i] + "\t" + hargaBuah + "\t"  + subtotal);
            total += subtotal;

    }
}}