import java.util.Date;
import java.util.List;

/**
 * Created by urbain on 23/01/2015.
 */
public interface AuthorService {

    List<Book> getBooksFromAuthor(String authorFirstName, String authorLastName) throws AuthorNotFoundException;

    Author getAuthor(Long id) throws AuthorNotFoundException;

    List<Author> getAuthorsByName(String firstName, String lastName) throws AuthorNotFoundException;

    Long createAuthor(String firstName, String lastName, String nationality, Date dateOfBirth, Date dateOfDeath);

}
