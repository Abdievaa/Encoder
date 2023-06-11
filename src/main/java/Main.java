

public class Main {
    public static void main(String[] args)  {
        while (true) {
            Util.writeMessage("""
                    Choose the act
                    1.Encrypt
                    2.Decrypt
                    3.Bruteforce
                    4.Statistic
                    5.Exit""");


            switch (Util.readString()) {
                case "1" -> new EncryptedDecrypted().encryptedDecrypted(true);
                case "2" -> new EncryptedDecrypted().encryptedDecrypted(false);
                case "3" -> new Bruteforce().bruteforce();
                case "4" -> System.out.println("Statistic");
                case "5" -> {
                    return;
                }
            }
        }

    }
}
