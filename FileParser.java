import java.util.List;

abstract public class FileParser {
    abstract List<Book> read(String filePath);
}
