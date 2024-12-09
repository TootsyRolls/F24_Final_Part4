package Classes;

import java.util.ArrayList;
import Classes.Book;

public class Library {
    private ArrayList<Book> books;

    // Default Constructor with 5 presets
    public Library() {
        books = new ArrayList<>();

        books.add(new Book("Animal Farm","George Orwell",11.99,"Secker & Warburg","978-0-45-152634-2"));
        books.add(new Book("Crime & Punishment","Fyodor Dostoevsky",8.99,"Simon & Schuster","0-4864-1587-2"));
        books.add(new Book("Moby Dick","Herman Melville",14.14,"Harper & Brothers","978-1-5032807-8-6"));
        books.add(new Book("Inferno","Dante Alighieri",11.99,"Indiana University Press","1-4903-0978-0"));
        books.add(new Book("War and Peace","Leo Tolstoy",21.99,"Oxford University Press","978-0-393-96647-3"));
    }

    // Arraylist Constructor
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    // Copy Constructor
    public Library(Library other) {
        this.books = new ArrayList<>(other.books);
    }

    // Search Method
    public ArrayList<Book> searchBook(String input) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) { // Goes through book objects in book library
            if (book.getTitle().toLowerCase().contains(input.toLowerCase())) { // Looks for title match, lowercased to remove capitalization errors in search
                result.add(book);
            }
        }
        return result;
    }

    // Equals Method
    public boolean equals(Object other) {
        if (this == other) {
            return true; // Is true if the object and other are the same
        }
        if (other == null || getClass() != other.getClass()) {
            return false; // If other is not in the same library or is not equal to the object then is false
        }
        Library library = (Library) other; // Places other into a library to be accessed by books
        return books.equals(library.books); // Accesses books of library to see if equal or not
    }

    // toString Method
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book : books) { // Looks over at each book object and formats them
            result.append(book.getTitle()).append("by: ").append(book.getAuthor()).append("\n"); // Format : Title by Author\n
        }
        return result.toString();
    }

    // Getters & Setters
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

// Hello professor, it was a pleasure taking your class :)