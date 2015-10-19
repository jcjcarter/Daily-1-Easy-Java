import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        /* Stores the information for the user. */
        String[] infomation = new String[3];

        /* Scanner to take in the information. */
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is your name? ");
        infomation[0] = scanner.next();

        System.out.println("How old are you? " );
        infomation[1] = scanner.next();

        System.out.println("What is your username? ");
        infomation[2] = scanner.next();

        System.out.println("Your name is " +infomation[0]+ ", you are "+ infomation[1]
        + " years old, and  youu username is " + infomation[2]);
    }
}
