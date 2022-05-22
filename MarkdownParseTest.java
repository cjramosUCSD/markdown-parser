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

    /*@Test
    public void getLinksTest5() throws IOException{
        Path filePath = Path.of("test5.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        ArrayList<String> linkEmpty = new ArrayList<>();
        assertEquals("a",links.get(0));
        
    }*/
    
    @Test
    public void labReport1() throws IOException{
        Path filePath = Path.of("LabReportTest1.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        
        assertEquals(List.of("%60google.com", "google.com", "ucsd.edu"),links);
        
    }

    @Test
    public void labReport2() throws IOException{
        Path filePath = Path.of("LabReportTest2.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        assertEquals(List.of("a.com", "a.com(())", "example.com"),links);
        
    }

    @Test
    public void labReport3() throws IOException{
        Path filePath = Path.of("LabReportTest3.md");
        String contents = Files.readString(filePath);
        ArrayList<String> links = new MarkdownParse().getLinks(contents);
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule")
        ,links);
        
    }


}

