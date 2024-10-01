public class FileReaderFactory {

    FileParser createFileReader(String type){


        if(type.equals("xml")){
            return new XmlFileReader();

        }else if(type.equals("csv")){
            return new CsvFileReader();

        }else if(type.equals("json")){
            return new JsonFileReader();

        }

        return null;



    }



}
