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
}
