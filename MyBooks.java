public class MyBooks {
    public static void main(String[] args) {
        Book book1 = new Book();
        Encyclopedia book2 = new Encyclopedia();

        book1.setTitle("The Hobbit");
        book1.setAuthor("J. R. R. Tolkien");
        book1.setPublisher("George Allen & Unwin");
        book1.setDate("21 September 1937");
        book1.printInfo();

        book2.setTitle("The Illustrated Encyclopedia of the Universe");
        book2.setAuthor("Ian Ridpath");
        book2.setPublisher("Watson-Guptill");
        book2.setDate("2001");
        book2.setEdition("2nd");
        book2.setPages(384);
        book2.printInfo();
    }
}
