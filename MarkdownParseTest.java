import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException{
        Path filePath = Path.of("test-file.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        assertEquals("some-thing.html",links.get(1));
        
    }
    @Test
    public void getLinksTest2() throws IOException{
        Path filePath = Path.of("test2.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }
    @Test
    public void getLinksTest3() throws IOException{
        Path filePath = Path.of("test3.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }
    @Test
    public void getLinksTest4() throws IOException{
        Path filePath = Path.of("test4.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }

    @Test
    public void getLinksTest5() throws IOException{
        Path filePath = Path.of("test-file.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        assertEquals("",links.get(1));
        
    }
}

