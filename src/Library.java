public class Library {
    public static void main(String[] args) {
        final String appName = "Library v0.1";

        String title = "Efekt motyla";
        String author = "Kamil Celubski";
        int releaseDate = 2008;
        int pages = 141;
        String publisher ="Złote Myśli";
        String isbn = "9788375821994";

        System.out.println(appName);
        System.out.println("Available items:");
        System.out.println(title + ", " + author + ", " + releaseDate + ", " + pages + ", " + publisher + ", " + isbn);
    }
}