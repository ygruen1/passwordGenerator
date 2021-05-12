public class PasswordGenerator {
    public String generate(int length) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(i);
        }
        return builder.toString();
    }
}
