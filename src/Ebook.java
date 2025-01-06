public class Ebook extends books{
    private String format;

    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;

    }
}
