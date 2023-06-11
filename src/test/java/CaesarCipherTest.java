import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {
    private CaesarCipher cipher = new CaesarCipher();
    private String notEncrypt = "Hello World!";
    private String encrypt = "Khoor*Zruog+";
    private int key = 3;


    @Test
    public void encrypt() {
        assertEquals(cipher.encrypt(notEncrypt, key), encrypt);
    }

    @Test
    public void decrypt() {
        assertEquals(cipher.decrypt(encrypt,key),notEncrypt);
    }
}