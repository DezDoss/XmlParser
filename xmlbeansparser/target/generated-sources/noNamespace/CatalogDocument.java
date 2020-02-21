/*
 * An XML document type.
 * Localname: catalog
 * Namespace: 
 * Java type: noNamespace.CatalogDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one catalog(@) element.
 *
 * This is a complex type.
 */
public interface CatalogDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CatalogDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA4E777ECFCD559279F5F1825BAEF6C0A").resolveHandle("catalog8d80doctype");
    
    /**
     * Gets the "catalog" element
     */
    noNamespace.CatalogDocument.Catalog getCatalog();
    
    /**
     * Sets the "catalog" element
     */
    void setCatalog(noNamespace.CatalogDocument.Catalog catalog);
    
    /**
     * Appends and returns a new empty "catalog" element
     */
    noNamespace.CatalogDocument.Catalog addNewCatalog();
    
    /**
     * An XML catalog(@).
     *
     * This is a complex type.
     */
    public interface Catalog extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Catalog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA4E777ECFCD559279F5F1825BAEF6C0A").resolveHandle("catalog83d5elemtype");
        
        /**
         * Gets array of all "book" elements
         */
        noNamespace.CatalogDocument.Catalog.Book[] getBookArray();
        
        /**
         * Gets ith "book" element
         */
        noNamespace.CatalogDocument.Catalog.Book getBookArray(int i);
        
        /**
         * Returns number of "book" element
         */
        int sizeOfBookArray();
        
        /**
         * Sets array of all "book" element
         */
        void setBookArray(noNamespace.CatalogDocument.Catalog.Book[] bookArray);
        
        /**
         * Sets ith "book" element
         */
        void setBookArray(int i, noNamespace.CatalogDocument.Catalog.Book book);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "book" element
         */
        noNamespace.CatalogDocument.Catalog.Book insertNewBook(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "book" element
         */
        noNamespace.CatalogDocument.Catalog.Book addNewBook();
        
        /**
         * Removes the ith "book" element
         */
        void removeBook(int i);
        
        /**
         * An XML book(@).
         *
         * This is a complex type.
         */
        public interface Book extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Book.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA4E777ECFCD559279F5F1825BAEF6C0A").resolveHandle("bookf8caelemtype");
            
            /**
             * Gets the "author" element
             */
            java.lang.String getAuthor();
            
            /**
             * Gets (as xml) the "author" element
             */
            org.apache.xmlbeans.XmlString xgetAuthor();
            
            /**
             * Sets the "author" element
             */
            void setAuthor(java.lang.String author);
            
            /**
             * Sets (as xml) the "author" element
             */
            void xsetAuthor(org.apache.xmlbeans.XmlString author);
            
            /**
             * Gets the "title" element
             */
            java.lang.String getTitle();
            
            /**
             * Gets (as xml) the "title" element
             */
            org.apache.xmlbeans.XmlString xgetTitle();
            
            /**
             * Sets the "title" element
             */
            void setTitle(java.lang.String title);
            
            /**
             * Sets (as xml) the "title" element
             */
            void xsetTitle(org.apache.xmlbeans.XmlString title);
            
            /**
             * Gets the "genre" element
             */
            java.lang.String getGenre();
            
            /**
             * Gets (as xml) the "genre" element
             */
            org.apache.xmlbeans.XmlString xgetGenre();
            
            /**
             * Sets the "genre" element
             */
            void setGenre(java.lang.String genre);
            
            /**
             * Sets (as xml) the "genre" element
             */
            void xsetGenre(org.apache.xmlbeans.XmlString genre);
            
            /**
             * Gets the "price" element
             */
            java.math.BigDecimal getPrice();
            
            /**
             * Gets (as xml) the "price" element
             */
            org.apache.xmlbeans.XmlDecimal xgetPrice();
            
            /**
             * Sets the "price" element
             */
            void setPrice(java.math.BigDecimal price);
            
            /**
             * Sets (as xml) the "price" element
             */
            void xsetPrice(org.apache.xmlbeans.XmlDecimal price);
            
            /**
             * Gets the "publish_date" element
             */
            java.util.Calendar getPublishDate();
            
            /**
             * Gets (as xml) the "publish_date" element
             */
            org.apache.xmlbeans.XmlDate xgetPublishDate();
            
            /**
             * Sets the "publish_date" element
             */
            void setPublishDate(java.util.Calendar publishDate);
            
            /**
             * Sets (as xml) the "publish_date" element
             */
            void xsetPublishDate(org.apache.xmlbeans.XmlDate publishDate);
            
            /**
             * Gets the "description" element
             */
            java.lang.String getDescription();
            
            /**
             * Gets (as xml) the "description" element
             */
            org.apache.xmlbeans.XmlString xgetDescription();
            
            /**
             * Sets the "description" element
             */
            void setDescription(java.lang.String description);
            
            /**
             * Sets (as xml) the "description" element
             */
            void xsetDescription(org.apache.xmlbeans.XmlString description);
            
            /**
             * Gets the "id" attribute
             */
            java.lang.String getId();
            
            /**
             * Gets (as xml) the "id" attribute
             */
            org.apache.xmlbeans.XmlString xgetId();
            
            /**
             * Sets the "id" attribute
             */
            void setId(java.lang.String id);
            
            /**
             * Sets (as xml) the "id" attribute
             */
            void xsetId(org.apache.xmlbeans.XmlString id);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.CatalogDocument.Catalog.Book newInstance() {
                  return (noNamespace.CatalogDocument.Catalog.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.CatalogDocument.Catalog.Book newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.CatalogDocument.Catalog.Book) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.CatalogDocument.Catalog newInstance() {
              return (noNamespace.CatalogDocument.Catalog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.CatalogDocument.Catalog newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.CatalogDocument.Catalog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.CatalogDocument newInstance() {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.CatalogDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.CatalogDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.CatalogDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.CatalogDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.CatalogDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.CatalogDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.CatalogDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.CatalogDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.CatalogDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.CatalogDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.CatalogDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.CatalogDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.CatalogDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.CatalogDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.CatalogDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.CatalogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.CatalogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
