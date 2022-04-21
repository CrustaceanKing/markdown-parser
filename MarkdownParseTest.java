import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        compareString.add("https://something.com");
        compareString.add("some-page.html");
        Path fileName = Path.of("test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks2() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        compareString.add("https://something.com");
        compareString.add("some-page.html");
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks3() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks4() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks5() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        compareString.add("page.com");
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks6() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        compareString.add("page.com");
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks7() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }

    @Test
    public void getLinks8() throws IOException{
        ArrayList<String> compareString = new ArrayList<String>();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = markParse2.getLinks(content);
        assertEquals(compareString, links);
    }
}
