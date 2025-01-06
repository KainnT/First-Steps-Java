public class books {
    private final String title;
    private final String author;
    private final int pageCount;

    books(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }
}
