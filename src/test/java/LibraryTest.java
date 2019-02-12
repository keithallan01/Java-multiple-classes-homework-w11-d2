import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;


    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book1 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book2 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book3 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book4 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book5 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
        book6 = new Book("Lord Of The Rings", "Tolkien", "Fantasy");

    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void hasNoCapacityToAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void canLendBookToBorrower(){
        library.lendBook(borrower);
        assertEquals(1, library.bookCount());
    }
}
