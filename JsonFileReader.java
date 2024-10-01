
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileReader extends FileParser{

    List<Book>books;

    List<Book> read(String filePath){

        File jsonFile = new File(filePath);

        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            books = objectMapper.readValue(jsonFile, new TypeReference<List<Book>>(){});


        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;

    }


    }



