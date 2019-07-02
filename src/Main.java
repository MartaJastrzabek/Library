public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Henryk", "Sienkiewicz", "W pustyni i w puszczy", 2019, 316, "Greg", 9788373271890l);
        Book book2 = new Book();
        System.out.println("Books available in our library: ");
        System.out.println("Title: " + book1.title + ", Author: " + book1.author.firstName + " " + book1.author.surname + ", Number of pages " + book1.pagesNumber);
        System.out.println("Title: " + book2.title + ", Author: " + book2.author.firstName + " " + book2.author.surname + ", Number of pages " + book2.pagesNumber);

    }
}
