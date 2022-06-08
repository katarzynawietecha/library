public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.1";

        Book book1 = new Book();
        book1.title = "Efekt motyla";
        book1.author = "Kamil Celubski";
        book1.releaseDate = 2008;
        book1.pages = 141;
        book1.publisher ="Złote Myśli";
        book1.isbn = "9788375821994";

        System.out.println(appName);
        System.out.println("Available items:");
        System.out.println(book1.title + ", " + book1.author + ", " + book1.releaseDate + ", " + book1.pages + ", " + book1.publisher + ", " + book1.isbn);
    }
}