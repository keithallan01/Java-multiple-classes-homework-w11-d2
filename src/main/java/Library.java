import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(Integer capacity){
        this.capacity = 20;
        this.books = new ArrayList<>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public int getCapacity(){
        return this.capacity;
    }
}
