public class Decryption {
    public static String Lynda(String msg, int key) {
        char alph;
        String decryptedMsg = " ";
        for (int i = 0; i < msg.length(); ++i) {
            alph = msg.charAt(i);

            if (alph >= 'a' && alph <= 'z') {
                alph = (char) (alph - key);

                if (alph < 'a') {
                    alph = (char) (alph + 'z' - 'a' + 1);
                }
                decryptedMsg += alph;
            } else if (alph >= 'A' && alph <= 'Z') {
                alph = (char) (alph - key);

                if (alph < 'A') {
                    alph = (char) (alph + 'Z' - 'A' + 1);
                }
                decryptedMsg += alph;
            } else {
                decryptedMsg += alph;
            }
        }
        return decryptedMsg;
    }
}

