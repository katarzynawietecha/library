public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book (String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }

    Book (String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this (title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }
    
    String getBookInfo () {
        return title + ", " + author + ", " + releaseDate + ", " + pages + ", " + publisher + ", " + isbn;
    }
}