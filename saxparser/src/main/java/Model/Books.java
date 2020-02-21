package Model;

public class Books {
    private String author;
    private String title;
    private String genre;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String price;
    private String published_date;

    public Books(String author, String title, String genre, String price, String published_date, String description) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.published_date = published_date;
        this.description = description;
    }

    private String description;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
