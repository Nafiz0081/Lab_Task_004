import java.sql.SQLOutput;

public class Book {


    private String bookName;
    private String authorName;
    private String genre;
    private int numberOfPages;
    private Date date;


    public Book(String bookName,String authorName,String genre,int numberOfPages,Date date){

        this.bookName=bookName;
        this.authorName=authorName;
        this.numberOfPages=numberOfPages;
        this.genre=genre;
        this.date=date;

    }

    String getBookName(){
        return bookName;
    }


    int getYear(){
        return date.getYear();
    }

    int getMonth(){
        return date.getMonth();
    }
    int getNumberOfPages(){
        return numberOfPages;
    }


    void printDate(){
        System.out.println(date.getYear());
    }


    void booksReadPreviousYear(){


    }












}
