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
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : books) { // Goes through book objects in a book library
            if (book.getTitle().toLowerCase().contains(input.toLowerCase())) { // Looks for title match, lowercased to remove capitalization errors in search
                books.add(book);
            }
        }
        return books;
    }

    // Equals Method

    // toString Method

    // Getters & Setters



}
