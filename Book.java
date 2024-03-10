public class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected String date;

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setPublisher(String bookPub) {
        publisher = bookPub;
    }

    public void setDate(String pubDate) {
        date = pubDate;
    }

    public void printInfo() {
        System.out.println("Book Information:");
        System.out.println("\tBook Title: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPublisher: " + publisher);
        System.out.println("\tPublication Date: " + date);
    }
}
