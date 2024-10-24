import java.util.Scanner;

public class kalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.println("Pilih operasi (1/2/3/4)");
        int pilihan = scanner.nextInt();

        System.out.println("Masukkan nilai pertama: ");
        double nilai1  = scanner.nextDouble();

        System.out.println("Masukkan nilai kedua: ");
        double nilai2 =  scanner.nextDouble();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = nilai1 + nilai2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = nilai1 - nilai2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case  3:
                hasil = nilai1 * nilai2;
                System.out.println("Hasil Perkalian " + hasil);
                break;
            case  4:
                if (nilai2 != 0) {
                    hasil = nilai1 / nilai2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Error! Pembagian tidak dapat dilakukan");
                    }
                    break;
                    default:
                    System.out.println("Error! Pilihan tidak tersedia");
                    }

                
        
    }}

