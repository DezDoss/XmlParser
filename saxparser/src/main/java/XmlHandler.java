import Model.Books;
import Model.Catalog;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class XmlHandler extends DefaultHandler {
    private List<Books> books = new ArrayList<Books>();
    private String qName;
    private String author, title, genre, published_date, description, price;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        this.qName = qName;
    }


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String information = new String(ch, start, length);
        information = information.replace("\n", "").trim();
        if (!qName.isEmpty()) {
            if (qName.equals("author")) {
                author = information;
            }  if (qName.equals("title")) {
                title = information;
            }  if (qName.equals("genre")) {
                genre = information;
            }  if (qName.equals("price")) {
                price = information;
            }  if (qName.equals("published_date")) {
                published_date = information;
            }  if(qName.equals("description")) {
                description = information;
            }

        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
            if((author != null && !author.isEmpty()) &&(title != null && !title.isEmpty()) &&
                    (genre != null && !genre.isEmpty()) && (price != null && !price.isEmpty()) &&
                    (published_date != null && !published_date.isEmpty()) && (description != null && !description.isEmpty())) {
                books.add(new Books(author, title, genre, price, published_date, description));
                author = null;
                title = null;
                genre = null;
                price = null;
                genre = null;
                published_date = null;
                description = null;
            }


    }

    public List<Books> getBooks() {


        return books;

    }

}
