import noNamespace.CatalogDocument;
import noNamespace.CatalogDocument.Catalog;
import org.apache.xmlbeans.XmlException;

import java.io.IOException;
import java.io.InputStream;

public class XmlBeansParser {

    public XmlBeansParser() {

    }
    public static void main(String[] args) throws IOException, XmlException {

        CatalogDocument catalog = new XmlBeansParser().parseXML();
        Catalog.Book[] books = catalog.getCatalog().getBookArray();

//        CatalogDocument.Catalog.Book[] books = new XmlBeansParser().parseXML();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getId());
            System.out.println(books[i].getAuthor());
            System.out.println(books[i].getDescription());
            System.out.println(books[i].getGenre());
            System.out.println(books[i].getPrice());
            System.out.println(books[i].getPublishDate());
            System.out.println("---------------------------------------------");
        }
    }


    public CatalogDocument parseXML() throws IOException, XmlException {

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("books.xml");
        CatalogDocument catalog = null;
        catalog = CatalogDocument.Factory.parse(inputStream);
        if (!catalog.isNil()) {
            return catalog;
        }


        return null;
    }

}
