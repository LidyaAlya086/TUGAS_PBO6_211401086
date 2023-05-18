package main;
import book.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Book book = new Book("Harry Potter", "J.K. Rowling", "belum");

        // Membuat peminjaman buku
        Book.Loan loan = book.new Loan("John Doe", "belum");

        // Menampilkan informasi buku
        book.display();

        // Menampilkan informasi peminjaman
        System.out.println("\n- Informasi Peminjam Terakhir -");
        System.out.println("Nama peminjam     : " + loan.getBorrower());
        System.out.println("Buku dikembalikan : " + loan.isReturned());

        // Minta input dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n- Pengecekan Pengembalian Buku -");
            System.out.print("Apakah buku sudah dikembalikan? (true/false): ");
            boolean isReturned = scanner.nextBoolean();

            // Mengembalikan buku berdasarkan input pengguna
            if (isReturned) {
                loan.returnBook();
                System.out.println("\n- Informasi Ketersediaan Buku di Perpustakaan -");
                System.out.println("Buku sudah dikembalikan         : " + loan.isReturned());
                System.out.println("Buku tersedia untuk dipinjam    : " + book.isAvailable());
                System.out.println("\nBuku tersedia untuk dipinjam.\n");
            } else {
                System.out.println("\nBuku belum dikembalikan oleh peminjam sebelumnya.");
                System.out.println("Mohon meminta peminjam buku terakhir untuk segera mengembalikan bukunya.\n");
            }
        }
    }
}
