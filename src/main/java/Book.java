import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String genre;
    private ArrayList<Book> books;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.books = new ArrayList<>();
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }
}
