public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java с нуля";
        book1.author = "Иванов";
        book1.pages = 358;
        book1.year = 2024;

        Book book2 = new Book();
        book2.title = "Чистый код";
        book2.author = "Мартин";
        book2.pages = 464;
        book2.year = 2020;

        System.out.println(book1.getInfo());
        System.out.println();
        System.out.println(book2.getInfo());
    }
}
