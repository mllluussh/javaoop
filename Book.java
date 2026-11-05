public class Book {
    public String title;
    public String author;
    public int pages;
    public int year;

    public String getInfo() {
        return "Книга: " + title + "\nАвтор: " + author + "\nСтраниц: " + pages + ". Год: " + year;
    }
}
