import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncryptedDecrypted {
    private final CaesarCipher caesar = new CaesarCipher();

    public void encryptedDecrypted(boolean flag) throws IOException {
        Util.writeMessage("Enter the path to " + (flag ? "encrypted" : "decrypted"));
        String path = Util.readString();
        Util.writeMessage("Enter the key");
        int key = Util.readInt();
        Path newPath = Util.builderFileName(path, flag ? "_encrypt" : "_decrypted");
        String content = Files.readString(Path.of(path));
        String encryptDecrypt = flag ? caesar.encrypt(content, key) : caesar.decrypt(content, key);
        Files.writeString(newPath, encryptDecrypt);
        Util.writeMessage("File " + newPath.getFileName() + (flag ? " encrypted" : " decrypted")
                + System.lineSeparator());

    }
}
