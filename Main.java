import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        FileReaderFactory factory=new FileReaderFactory();

        FileParser csvParserMachine=factory.createFileReader("csv");
        List<Book>books=csvParserMachine.read("C:\\Users\\Dell\\Desktop\\OOC_Lab_Task_4\\src\\bookData.csv");
        FileParser jsonParserMachine=factory.createFileReader("json");
        List<Book>bookList=jsonParserMachine.read("C:\\Users\\Dell\\Desktop\\OOC_Lab_Task_4\\src\\Books.json");



        BookListAnalyzer ba=new BookListAnalyzer();
        ba.booksReadLastYear(books);
        ba.countAveragePage(books);


        for(Book b : books){
            System.out.println(b.getBookName());
            System.out.println(b.getNumberOfPages());
            System.out.println(b.getMonth());
            b.printDate();

        }
        for(Book b : bookList){
            System.out.println(b.getBookName());
            System.out.println(b.getNumberOfPages());
            System.out.println(b.getMonth());
            b.printDate();

        }

    }









}