package main.java.com.boarding;

import java.util.Scanner;

import main.java.com.boarding.model.BoardingPass;
import main.java.com.boarding.service.BoardingPassService;

public class App {
    public static void main(String[] args) {
        BoardingPassService service = new BoardingPassService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Boarding Pass ===");
            System.out.println("1. Tambah Boarding Pass");
            System.out.println("2. Hapus Boarding Pass");
            System.out.println("3. Tampilkan Semua Boarding Pass");
            System.out.println("4. Cari Boarding Pass");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Penumpang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Penerbangan: ");
                    String flight = scanner.nextLine();
                    service.addBoardingPass(id, nama, flight);
                    break;

                case 2:
                    System.out.print("Masukkan ID yang akan dihapus: ");
                    String idHapus = scanner.nextLine();
                    service.deleteBoardingPass(idHapus);
                    break;

                case 3:
                    service.displayAllBoardingPasses();
                    break;

                case 4:
                    System.out.print("Masukkan ID untuk pencarian: ");
                    String idCari = scanner.nextLine();
                    BoardingPass hasil = service.searchBoardingPass(idCari);
                    if (hasil != null) {
                        System.out.println("Data ditemukan: " + hasil);
                    } else {
                        System.out.println("Boarding pass dengan ID ini tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
