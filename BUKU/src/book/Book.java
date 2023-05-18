package book;
import abstrak.*;

public class Book extends LibraryItem {
    private String author;
    private String isAvailable;

    public Book(String title, String author, String isAvailable) {
        super(title);
        this.author = author;
        this.isAvailable = "sudah"; 
    }

    // Inner class untuk peminjaman buku
    public class Loan {
        private String borrower;
        private String isReturned;

        public Loan(String borrower, String isReturned) {
            this.borrower = borrower;
            this.isReturned = "belum"; 
            isAvailable = "belum"; 
        }

        public void returnBook() {
            isReturned = "sudah"; 
            isAvailable = "sudah"; 
        }

        public String isReturned() {
            return isReturned;
        }

        public String getBorrower() {
            return borrower;
        }
    }

    public String getAuthor() {
        return author;
    }

    public String isAvailable() {
        return isAvailable;
    }

    @Override
    public void display() {
        System.out.println("- Informasi Buku -");
        System.out.println("Judul                           : " + getTitle());
        System.out.println("Author                          : " + getAuthor());
        System.out.println("Ketersediaan/Sudah Dikembalikan : " + isAvailable());
    }
}
