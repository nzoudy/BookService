/**
 * Created by urbain on 23/01/2015.
 */
public class AuthorNotFoundException extends Throwable {

    private Long id;
    private String author;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}
}
