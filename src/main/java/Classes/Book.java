package Classes;

public class Book {
    private String title; // Has to be titlecase
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    // Default
    public Book() {
    }

    // Title Constructor
    public Book(String title) {
        this.title = title;
    }

    // Full Data Constructor
    public Book(String title, String author, double price, String publisher, String isbn) {

    }

    // Copy Constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }


    public int checkIsbnStatus() {
        String pureIsbn = isbn.replaceAll("-","");

        if (pureIsbn.length() == 10) {
            return 0;
        }
        else if (pureIsbn.length() == 13) {
            return 1;
        }
        else { // If not 10 or 13 then invalid
            return -1;
        }
    }

    public String toTitleCase() {
        StringBuilder titleCase = new StringBuilder();
        titleCase.append(title);
        return titleCase.toString();
    }

}
