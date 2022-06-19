package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.1";

        Book book1 = new Book("Efekt motyla", "Kamil Celubski", 2008, 141, "Złote Myśli", "9788375821994");
        Book book2 = new Book("Jesteś cudem", "Regina Brett", 2022, 256, "Insignis", "9788367323055");
        Book book3 = new Book("Finansowa Forteca", "Marcin Iwuć", 2020, 800, "Finanse Bardzo Osobiste");

        System.out.println(appName);
        System.out.println("Available items:");
        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());
    }
}