public class CaesarCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            ".,\":!? +-*/\\@#$%^&(){}[];'|`~=_©«»—" + "0123456789";

    public String encrypt(String message, int key) {
        StringBuilder builder = new StringBuilder();
        char[] chars = message.toCharArray();
        for (char aChar : chars) {
            int index = ALPHABET.indexOf(aChar);
            if (index >= 0) {
                int newIndex = (index + key) % ALPHABET.length();
                char charAt = ALPHABET.charAt(newIndex < 0 ? newIndex + ALPHABET.length() : newIndex);
                builder.append(charAt);
            }
        }
        return builder.toString();
    }


    public String decrypt(String message, int key) {
        return encrypt(message, -key);

    }
}
