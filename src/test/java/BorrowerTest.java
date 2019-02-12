import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;


    @Before
    public void before(){
    borrower = new Borrower();
    }

    @Test
    public void initiallyHasNoBooks(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void addBookToCollection(){
        borrower.addBook(book);
        assertEquals(1, borrower.getBookCount());
    }


}
