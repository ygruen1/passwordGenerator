import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void generatePasswordWithAtLeast1Number() {
        password = generator.generate();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.find());
    }

    @Test
    public void generatePasswordWithAtLeast1Letter() {
        password = generator.generate();
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.find());
    }

    @Test
    public void generatePasswordWithAtLeast1SpecialSymbol() {
        password = generator.generate();
        Pattern pattern = Pattern.compile("[!@#$]+");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.find());
    }

    @Test
    public void generatePasswordWithAtLeast1ofEachTypeOfCharachter() {

        password = generator.generate();
        System.out.println(password);

        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.find());

        pattern = Pattern.compile("[!@#$]+");
        matcher = pattern.matcher(password);
        assertTrue(matcher.find());

        pattern = Pattern.compile("[A-Z]+");
        matcher = pattern.matcher(password);
        assertTrue(matcher.find());

        pattern = Pattern.compile("[0-9]+");
        matcher = pattern.matcher(password);
        assertTrue(matcher.find());

    }

}