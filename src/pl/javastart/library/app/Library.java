package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.1";

        Book [] books = new Book[1000];
        books[0] = new Book("Efekt motyla", "Kamil Celubski", 2008, 141, "Złote Myśli", "9788375821994");
        books[1] =  new Book("Jesteś cudem", "Regina Brett", 2022, 256, "Insignis", "9788367323055");
        books[2] =  new Book("Finansowa Forteca", "Marcin Iwuć", 2020, 800, "Finanse Bardzo Osobiste");

        System.out.println(appName);
        System.out.println("Available items:");
        System.out.println(books[0].getBookInfo());
        System.out.println(books[1].getBookInfo());
        System.out.println(books[2].getBookInfo());
    }
}