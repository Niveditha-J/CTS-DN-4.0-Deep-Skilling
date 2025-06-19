package LibraryManagementSystem;

// Book.java
public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println(bookId + " | " + title + " | " + author);
    }
}

