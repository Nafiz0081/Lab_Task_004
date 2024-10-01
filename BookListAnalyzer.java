import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class BookListAnalyzer {



    public  void booksReadLastYear(List<Book> books){
        int bookcount=0;
        for(Book b:books){
            if(b.getYear()==2023){
                bookcount++;
            }
        }
        System.out.println("Number of Books Read Last Year: "+bookcount);
    }

    public  void countAveragePage(List<Book>books){


        int numberOfPages=0;
        int numberOfBooks=0;

        for(Book b: books){
            numberOfPages+=b.getNumberOfPages();
            numberOfBooks++;
        }
        try {

            System.out.println(numberOfPages / numberOfBooks);
        }catch (NumberFormatException e){
            System.out.println("Book List is empty");
        }



    }




    public void booksReadEachMonth(List<Book>books){

        int jan = 0,feb=0,march=0,april=0,may=0,june=0,july=0,august=0,sept=0,oct=0,nov=0,dec=0;

        for(Book b: books){

            switch (b.getMonth()){

                case 1:
                    jan++;
                    break;
                case 2:
                    feb++;
                    break;
                case 3:
                    march++;
                    break;
                case 4:
                    april++;
                    break;

                case 5:
                    may++;
                    break;
                case 6:
                    june++;
                    break;
                case 7:
                    july++;
                    break;
                case 8:
                    august++;
                    break;
                case 9:
                    sept++;
                    break;
                case 10:
                    oct++;
                    break;
                case 11:
                    nov++;
                    break;
                case 12:
                    dec++;
                    break;
            }


        }

        System.out.println("January: "+jan);
        System.out.println("Febrary: "+feb);
        System.out.println("March: "+march);
        System.out.println("April: "+april);
        System.out.println("May: "+may);
        System.out.println("June: "+june);
        System.out.println("July: "+july);
        System.out.println("august: "+august);
        System.out.println("September: "+sept);
        System.out.println("October: "+oct);
        System.out.println("November: "+nov);
        System.out.println("December: "+dec);








    }

    public void mostReadGenre(){



    }




}