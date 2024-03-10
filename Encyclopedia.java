public class Encyclopedia extends Book{
    private String edition;
    private int pages;

    public void setEdition(String bookEd) {
        edition = bookEd;
    }

    public String getEdition() {
        return edition;
    }

    public void setPages(int numPages) {
        pages = numPages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void printInfo() {
        System.out.println("Book Information");
        System.out.println("\tBook Title: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPublisher: " + publisher);
        System.out.println("\tPublication Date: " + date);
        System.out.println("\tEdition: " + edition);
        System.out.println("\tNumber of Pages: " + pages);

    }
}
