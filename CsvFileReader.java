import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CsvFileReader extends FileParser {

    List<Book>books;

    List<Book> read(String filePath){

        books=new ArrayList<>();

        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;

            while((line=br.readLine())!=null){
                String[]data=line.split(",");
                String bookName=data[0];
                String authorName=data[1];
                String genre=data[2];
                String numberOfPages=data[3];
                String fullDate=data[4];
                String[] partialDate= fullDate.split("-");
                Date date=new Date(Integer.parseInt(partialDate[0]),Integer.parseInt(partialDate[1]),Integer.parseInt(partialDate[2]));

                Book book= new Book(bookName,authorName,genre,Integer.parseInt(data[3]),date);

                books.add(book);

            }

        }catch (IOException e ){
            System.out.println("Error Reading File");
        }

        return books;

    }





}
