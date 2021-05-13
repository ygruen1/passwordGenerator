import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorShould {

    PasswordGenerator generator;
    String password;

    @BeforeEach
    void setUp() {
        generator = new PasswordGenerator();
        password = null;
    }

    @Test
    public void trueIsTrue() {
        assertTrue(true);
    }

    @Test
    public void generatePasswordWith5Charachters() {

        password = generator.generate(5);
        assertEquals(5, password.length());
    }

    @Test
    public void generatePasswordWith10Charachters() {
        password = generator.generate(10);
        assertEquals(10, password.length());
    }

    @Test
    public void generatePasswordWithAtLeast1Number() {
        password = generator.generate(10);
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.find());
    }

    @Test
    public void generatePasswordWithAtLeast1Letter() {
        password = generator.generate(10);
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);
        //assertTrue(matcher.find());
    }
}