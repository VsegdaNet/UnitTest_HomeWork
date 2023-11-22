
import HomeWork3.MainHWTaskTwo;
import HomeWork4.Book;
import HomeWork4.BookRepository;
import HomeWork4.InMemoryBookRepository;
import HomeWork4.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;


public class testHomeWork4 {

  @Test
  public void testfindBookById() {
    BookRepository testbookRepository = mock(BookRepository.class);
    when(testbookRepository.findById(anyString())).thenReturn(new Book("001A"));
    BookService testBook = new BookService(testbookRepository);
    testBook.findBookById("001A");
  }

  @Test
  public void testfindAllBooks() {
    BookRepository testBookRepository = mock(BookRepository.class);
    List baseBook = Arrays.asList(
            new Book("001A", "Book1", "Author1"),
            new Book("002A", "Book2", "Author2"),
            new Book("003A", "Book3", "Author3"),
            new Book("004A", "Book4", "Author4"),
            new Book("005A", "Book5", "Author5")
    );
    when(testBookRepository.findAll(anyString())).thenReturn(baseBook);
    BookService testbookService = new BookService(testBookRepository);
    assertThat(testbookService.findAllBooks("SELECT id, title, author FROM book").size()).isEqualTo(5);

  }


  @Test
  public void testfindDBress() {
    BookRepository testBookRepository = mock(BookRepository.class);
    List baseBook = Arrays.asList(
            new Book("001A", "Book1", "Author1"),
            new Book("002A", "Book2", "Author2"),
            new Book("003A", "Book3", "Author3"),
            new Book("004A", "Book4", "Author4"),
            new Book("005A", "Book5", "Author5")
    );
    when(testBookRepository.findAll("Author5")).thenReturn(baseBook);
    BookService testbookService = new BookService(testBookRepository);
    List testDBress = testbookService.findAllBooks("Author5");
    assertEquals(baseBook, testDBress);
  }


}
