/*
 * An XML document type.
 * Localname: catalog
 * Namespace: 
 * Java type: noNamespace.CatalogDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one catalog(@) element.
 *
 * This is a complex type.
 */
public class CatalogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CatalogDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatalogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOG$0 = 
        new javax.xml.namespace.QName("", "catalog");
    
    
    /**
     * Gets the "catalog" element
     */
    public noNamespace.CatalogDocument.Catalog getCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catalog" element
     */
    public void setCatalog(noNamespace.CatalogDocument.Catalog catalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                target = (noNamespace.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            }
            target.set(catalog);
        }
    }
    
    /**
     * Appends and returns a new empty "catalog" element
     */
    public noNamespace.CatalogDocument.Catalog addNewCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CatalogDocument.Catalog target = null;
            target = (noNamespace.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            return target;
        }
    }
    /**
     * An XML catalog(@).
     *
     * This is a complex type.
     */
    public static class CatalogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CatalogDocument.Catalog
    {
        private static final long serialVersionUID = 1L;
        
        public CatalogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BOOK$0 = 
            new javax.xml.namespace.QName("", "book");
        
        
        /**
         * Gets array of all "book" elements
         */
        public noNamespace.CatalogDocument.Catalog.Book[] getBookArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOOK$0, targetList);
                noNamespace.CatalogDocument.Catalog.Book[] result = new noNamespace.CatalogDocument.Catalog.Book[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "book" element
         */
        public noNamespace.CatalogDocument.Catalog.Book getBookArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CatalogDocument.Catalog.Book target = null;
                target = (noNamespace.CatalogDocument.Catalog.Book)get_store().find_element_user(BOOK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "book" element
         */
        public int sizeOfBookArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOK$0);
            }
        }
        
        /**
         * Sets array of all "book" element
         */
        public void setBookArray(noNamespace.CatalogDocument.Catalog.Book[] bookArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bookArray, BOOK$0);
            }
        }
        
        /**
         * Sets ith "book" element
         */
        public void setBookArray(int i, noNamespace.CatalogDocument.Catalog.Book book)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CatalogDocument.Catalog.Book target = null;
                target = (noNamespace.CatalogDocument.Catalog.Book)get_store().find_element_user(BOOK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(book);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "book" element
         */
        public noNamespace.CatalogDocument.Catalog.Book insertNewBook(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CatalogDocument.Catalog.Book target = null;
                target = (noNamespace.CatalogDocument.Catalog.Book)get_store().insert_element_user(BOOK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "book" element
         */
        public noNamespace.CatalogDocument.Catalog.Book addNewBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CatalogDocument.Catalog.Book target = null;
                target = (noNamespace.CatalogDocument.Catalog.Book)get_store().add_element_user(BOOK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "book" element
         */
        public void removeBook(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOK$0, i);
            }
        }
        /**
         * An XML book(@).
         *
         * This is a complex type.
         */
        public static class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CatalogDocument.Catalog.Book
        {
            private static final long serialVersionUID = 1L;
            
            public BookImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AUTHOR$0 = 
                new javax.xml.namespace.QName("", "author");
            private static final javax.xml.namespace.QName TITLE$2 = 
                new javax.xml.namespace.QName("", "title");
            private static final javax.xml.namespace.QName GENRE$4 = 
                new javax.xml.namespace.QName("", "genre");
            private static final javax.xml.namespace.QName PRICE$6 = 
                new javax.xml.namespace.QName("", "price");
            private static final javax.xml.namespace.QName PUBLISHDATE$8 = 
                new javax.xml.namespace.QName("", "publish_date");
            private static final javax.xml.namespace.QName DESCRIPTION$10 = 
                new javax.xml.namespace.QName("", "description");
            private static final javax.xml.namespace.QName ID$12 = 
                new javax.xml.namespace.QName("", "id");
            
            
            /**
             * Gets the "author" element
             */
            public java.lang.String getAuthor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "author" element
             */
            public org.apache.xmlbeans.XmlString xgetAuthor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "author" element
             */
            public void setAuthor(java.lang.String author)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$0);
                    }
                    target.setStringValue(author);
                }
            }
            
            /**
             * Sets (as xml) the "author" element
             */
            public void xsetAuthor(org.apache.xmlbeans.XmlString author)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHOR$0);
                    }
                    target.set(author);
                }
            }
            
            /**
             * Gets the "title" element
             */
            public java.lang.String getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "title" element
             */
            public org.apache.xmlbeans.XmlString xgetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "title" element
             */
            public void setTitle(java.lang.String title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$2);
                    }
                    target.setStringValue(title);
                }
            }
            
            /**
             * Sets (as xml) the "title" element
             */
            public void xsetTitle(org.apache.xmlbeans.XmlString title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$2);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Gets the "genre" element
             */
            public java.lang.String getGenre()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENRE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "genre" element
             */
            public org.apache.xmlbeans.XmlString xgetGenre()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENRE$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "genre" element
             */
            public void setGenre(java.lang.String genre)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENRE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENRE$4);
                    }
                    target.setStringValue(genre);
                }
            }
            
            /**
             * Sets (as xml) the "genre" element
             */
            public void xsetGenre(org.apache.xmlbeans.XmlString genre)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENRE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENRE$4);
                    }
                    target.set(genre);
                }
            }
            
            /**
             * Gets the "price" element
             */
            public java.math.BigDecimal getPrice()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "price" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetPrice()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "price" element
             */
            public void setPrice(java.math.BigDecimal price)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$6);
                    }
                    target.setBigDecimalValue(price);
                }
            }
            
            /**
             * Sets (as xml) the "price" element
             */
            public void xsetPrice(org.apache.xmlbeans.XmlDecimal price)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRICE$6);
                    }
                    target.set(price);
                }
            }
            
            /**
             * Gets the "publish_date" element
             */
            public java.util.Calendar getPublishDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "publish_date" element
             */
            public org.apache.xmlbeans.XmlDate xgetPublishDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PUBLISHDATE$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "publish_date" element
             */
            public void setPublishDate(java.util.Calendar publishDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHDATE$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHDATE$8);
                    }
                    target.setCalendarValue(publishDate);
                }
            }
            
            /**
             * Sets (as xml) the "publish_date" element
             */
            public void xsetPublishDate(org.apache.xmlbeans.XmlDate publishDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(PUBLISHDATE$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(PUBLISHDATE$8);
                    }
                    target.set(publishDate);
                }
            }
            
            /**
             * Gets the "description" element
             */
            public java.lang.String getDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "description" element
             */
            public org.apache.xmlbeans.XmlString xgetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "description" element
             */
            public void setDescription(java.lang.String description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$10);
                    }
                    target.setStringValue(description);
                }
            }
            
            /**
             * Sets (as xml) the "description" element
             */
            public void xsetDescription(org.apache.xmlbeans.XmlString description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$10);
                    }
                    target.set(description);
                }
            }
            
            /**
             * Gets the "id" attribute
             */
            public java.lang.String getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" attribute
             */
            public org.apache.xmlbeans.XmlString xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
                    return target;
                }
            }
            
            /**
             * Sets the "id" attribute
             */
            public void setId(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" attribute
             */
            public void xsetId(org.apache.xmlbeans.XmlString id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$12);
                    }
                    target.set(id);
                }
            }
        }
    }
}
