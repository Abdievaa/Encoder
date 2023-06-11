import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;

public class Bruteforce {
    private final CaesarCipher caesar = new CaesarCipher();

    @SneakyThrows
    public void bruteforce(){
        Util.writeMessage("Enter the path to decrypt");
        String path = Util.readString();

        Path bruteforce = Util.builderFileName(path, "_bruteforce");

        String content = Files.readString(Path.of(path));

        for (int i = 0; i < caesar.alphabetLength(); i++) {
            String decrypt = caesar.decrypt(content, i);
            if(isValidateText(decrypt)){
                Files.writeString(bruteforce,decrypt);
                Util.writeMessage("decrypt to file "+ bruteforce.getFileName());
                Util.writeMessage("key "+ i + System.lineSeparator());
                break;
            }


        }
    }
    private boolean isValidateText(String text){
        return false;

    }


}
