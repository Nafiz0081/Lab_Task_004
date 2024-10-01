import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlFileReader extends FileParser{
    List<Book>books;

    List<Book> read(String filePath){
        File xmlFile = new File("path/to/your/books.xml");


        XmlMapper xmlMapper = new XmlMapper();

        try {

            Books booksWrapper = xmlMapper.readValue(xmlFile, Books.class);


            books = booksWrapper.getBooks();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }




    }



