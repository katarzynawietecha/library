package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.1";
        DataReader dataReader = new DataReader();

        Book [] books = new Book[1000];
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.closeScanner();

        System.out.println(appName);
        System.out.println("Available items:");
        System.out.println(books[0].getBookInfo());
        System.out.println(books[1].getBookInfo());
    }
}