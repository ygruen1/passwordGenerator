public class PasswordGenerator {

    char[] symbols = new char[]{'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'Y', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '!', '@', '#', '$'};

    public String generate() {
        final int length = 16;

        int min = 0;
        int max = symbols.length-1;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
            builder.append(symbols[randomIndex]);
        }
        return builder.toString();
    }
}
