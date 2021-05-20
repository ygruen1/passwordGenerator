import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerator {

    char[] allSymbols = new char[]{'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'Y', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0', '!', '@', '#', '$'};

    char[] numbers = new char[]{'1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0'};

    char[] lowercaseLetters = new char[]{'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    char[] uppercaseLetters = new char[]{'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'Y', 'V', 'W', 'X', 'Y', 'Z'};

    char[] specialChars = new char[]{'!', '@', '#', '$'};

    public String generate() {
        final int passwordLength = 16;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < passwordLength + 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        int randomLowercase = list.get(0);
        int randomUpperCase = list.get(1);
        int randomNumber = list.get(2);
        int randomSpecialChar = list.get(3);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {

            if (i == randomLowercase) {
                int randomIndex = getRandomIndex(lowercaseLetters.length);
                builder.append(lowercaseLetters[randomIndex]);
            } else if (i == randomUpperCase) {
                int randomIndex = getRandomIndex(uppercaseLetters.length);
                builder.append(uppercaseLetters[randomIndex]);

            } else if (i == randomSpecialChar) {
                int randomIndex = getRandomIndex(specialChars.length);
                builder.append(specialChars[randomIndex]);

            } else if (i == randomNumber) {
                int randomIndex = getRandomIndex(numbers.length);
                builder.append(numbers[randomIndex]);

            } else {
                int randomIndex = getRandomIndex(allSymbols.length);
                builder.append(allSymbols[randomIndex]);
            }


        }


        return builder.toString();
    }


    private int getRandomIndex(int arrayLength) {
        int min = 0;
        int max = arrayLength - 1;
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
