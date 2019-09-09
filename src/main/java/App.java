import java.util.Scanner;

public class App {
    public static void main(String []args) {
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String msg = sc.nextLine();
//        String message = sc.nextLine();

        System.out.println("Enter key: ");
        int key = sc.nextInt();

        Decryption  flower = new Decryption ();
        System.out.println("Here is result for encrypted  message: " + flower.Lynda(msg, key));
       System.out.println("You have type => " + msg );
    }
}

