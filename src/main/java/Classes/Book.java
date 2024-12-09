package Classes;

public class Book {
    private String title; // Has to be titlecase
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    // Default Constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    // Title Only Constructor
    public Book(String title) {
        this.title = toTitleCase(title);
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    // Full Data Constructor
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = toTitleCase(title);
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // Copy Constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }

    // ISBN Checker
    public int checkIsbnStatus() {
        String pureIsbn = isbn.replaceAll("-",""); // Removes spaces to check length better

        if (pureIsbn.length() == 10) {
            return 0;
        }
        else if (pureIsbn.length() == 13) {
            return 1;
        }
        else { // Invalid
            return -1;
        }
    }

    // Title Case Converter
    public String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true; // Has to be true for first letter to be capitalized

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) { // Looks for spaces between words
                nextTitleCase = true; // Resets the boolean after space, capitalizes the first letter
            }
            else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false; // Stops capitalization after first
            }
            else {
                c = Character.toLowerCase(c); // Lowercases the rest of the word for format
            }
            titleCase.append(c);
        }
        return titleCase.toString();

    }

    // toString Method
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nPrice: %.2f\nPublisher: %s\nISBN: %s", title, author, price, publisher, isbn);
    }

    // Equals Method

    public boolean equals(Object other) {
        boolean result;
        if ((other == null) || (this.getClass() != other.getClass())) { // Check first if object is equal to null or the same type of class first
            result = false; // If object is null or not the same class then false
        }
        else {
            Book otherBook = (Book) other; //  Places other into a book to access the isbn for comparing them below
            result = this.isbn.equals(otherBook.isbn); // Checks if isbn matches
        }
        return result;
    }

    // Clone Method
    public Book clone() {
        return new Book(this.title, this.author, this.price, this.publisher, this.isbn);
    }

    // Getters & Setters

    // Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Publisher
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // ISBN
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
