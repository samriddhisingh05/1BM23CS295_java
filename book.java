import java.util.Scanner;


class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book name: " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of pages: " + this.numPages + "\n";
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of books: ");
        n = s.nextInt(); 
        Books[] b = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.print("Enter name of book: ");
            String name = s.next();
            System.out.print("Enter author of book: ");
            String author = s.next();
            System.out.print("Enter price of book: ");
            int price = s.nextInt();
            System.out.print("Enter number of pages in the book: ");
            int numPages = s.nextInt();

            b[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (Books book : b) {
            System.out.println(book.toString());
        }

        s.close();
    }
}
