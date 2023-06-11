
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Util {
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));

    private Util() {
    }

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    @SneakyThrows
    public static String readString() {
        return CONSOLE.readLine();
    }

    @SneakyThrows
    public static int readInt() {
        return Integer.parseInt(readString());
    }

    public static Path builderFileName(String path, String suffix) {
        Path fullPath = Path.of(path);
        Path directory = fullPath.getParent();
        String fileName = fullPath.getFileName().toString();
        String newFileName = "";
        if (fileName.contains(".")) {
            int index = fileName.lastIndexOf(".");
            newFileName = fileName.substring(0, index) + suffix + fileName.substring(index);
        } else {
            newFileName = fileName + suffix;

        }
        return directory.resolve(newFileName);


///Users/aliiaabdyeva/Documents/Java-18/Encoder/src/test.txt


    }


}
