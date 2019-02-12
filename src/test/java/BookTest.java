import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Lord Of The Rings", "Tolkien", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Lord Of The Rings", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Tolkien", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, book.bookCount());
    }

    @Test
    public void canAddBook(){
        book.addBook(book);
        assertEquals(1, book.bookCount());
    }
}
