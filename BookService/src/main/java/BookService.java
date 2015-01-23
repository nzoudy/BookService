import javax.jws.WebService;
import java.util.List;

/**
 * Created by urbain on 23/01/2015.
 */

@WebService(name = "BookService", serviceName = "BookService")
public interface BookService {

    Book getBook(Long id) throws BookNotFoundException;

    List<Book> getBooksByTitle(String title);

    List<Author> getAuthorsFromBook(String bookTitle) throws BookNotFoundException;

    Long createBook(String title, BookType type, int year, Long... authorsId);
}
