import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
       this.borrowedBooks = new ArrayList<>();
    }

    public int getBookCount(){
        return this.borrowedBooks.size();
    }

    public void addBook(Book book){
        this.borrowedBooks.add(book);
    }
}
