import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }
    @Test
    public void converter1() {
        String expected = "A";
        String actual = converter.converter(100);
        assertEquals(expected, actual);
    }
    @Test
    public void converter2() {
        String expected = "A";
        String actual = converter.converter(90);
        assertEquals(expected, actual);
    }
}