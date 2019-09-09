
public class Encryption {
    public static String Roxane(String message,int key ){
        String encryptedMessage = "";
        char alphabets;
        for(int i = 0; i < message.length(); ++i){
            alphabets = message.charAt(i);

            if(alphabets >= 'a' && alphabets <= 'z'){
                alphabets = (char)(alphabets + key);

                if(alphabets> 'z'){
                    alphabets= (char)(alphabets - 'z' + 'a' - 1);
                }

                encryptedMessage += alphabets;
            }
            else if(alphabets >= 'A' && alphabets <= 'Z'){
                alphabets = (char)(alphabets + key);

                if(alphabets > 'Z'){
                    alphabets = (char)(alphabets- 'Z' + 'A' - 1);
                }
                encryptedMessage += alphabets;
            }
            else {
                encryptedMessage += alphabets;
            }
        }
        return encryptedMessage;
    }
}

