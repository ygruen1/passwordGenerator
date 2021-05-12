import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorShould {

    @BeforeEach
    void setUp() {
        System.out.println("before test");
    }

    @Test
    public void trueIsTrue(){
    assertTrue(true);
    }

    @Test
    public void generatePasswordWith5Charachters(){
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generate(5);
        assertEquals(5, password.length());
    }

    @Test
    public void generatePasswordWith10Charachters(){
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generate(10);
        assertEquals(10, password.length());
    }

    @Test
    public void generatePasswordWithAtLeast1NumberAnd1Letter(){

    }
}