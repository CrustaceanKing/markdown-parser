// Command to compile and run JUnit Tests
// javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar WordCount.java WordCountTest.java
// java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore WordCountTest

import static org.junit.Assert.*;
import org.junit.*;

public class WordCountTest {
    @Test
    public void testWordCount() {
        String three_words = "all is well";
        assertEquals(3, WordCount.countWords(three_words));
        System.out.println("First test done!");

        String three_words_with_space = " all is well ";
        assertEquals(3, WordCount.countWords(three_words_with_space));
    }
}
