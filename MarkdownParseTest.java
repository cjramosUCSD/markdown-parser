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
        Path filePath = Path.of("C:/Users/pyroh/OneDrive/Documents/GitHub/markdown-parser1/test-file.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        assertEquals("some-thing.html",links.get(1));
        
    }

    public void getLinksTest2() throws IOException{
        Path filePath = Path.of("C:/Users/pyroh/OneDrive/Documents/GitHub/markdown-parser1/test2.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }

    public void getLinksTest3() throws IOException{
        Path filePath = Path.of("C:/Users/pyroh/OneDrive/Documents/GitHub/markdown-parser1/test3.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }

    public void getLinksTest4() throws IOException{
        Path filePath = Path.of("C:/Users/pyroh/OneDrive/Documents/GitHub/markdown-parser1/test4.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals(linkEmpty,links);
        
    }
}

