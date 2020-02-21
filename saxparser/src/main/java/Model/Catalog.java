package Model;

import java.util.List;

public class Catalog {
    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    private List<Books> booksList;
}
