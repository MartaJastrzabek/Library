public class Book {
    Author author;
    String title;
    int published;
    int pagesNumber;
    String publisher;
    long ISBNnumber;

    public Book(){
        this.author = new Author();
        this.title = "Title not known.";
        this.published = 0;
        this.pagesNumber = 0;
        this.publisher = "Publisher not known.";
        this.ISBNnumber = 00000000000;
    }

    public Book(String firstName, String surname, String title, int published, int pagesNumber, String publisher, long ISBNnumber){
        this.author = new Author(firstName, surname);
        this.title = title;
        this.published = published;
        this.pagesNumber = pagesNumber;
        this.publisher = publisher;
        this.ISBNnumber = ISBNnumber;
    }

}
