import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    Parser parser = new Parser();

    @Test
    public void simpleString()
    {
        String expression="mama";
        String str = "papa mama ya";
        int result = parser.parse(expression,str);
        assertEquals(6,result);
    }
    @Test
    public void dotString()
    {
        String expression = "m.";
        String str = "papa mama ya";
        int result= parser.parse(expression,str);
        assertEquals(6,result);
    }
    

}