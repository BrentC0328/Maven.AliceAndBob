import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String userName = "";

        System.out.println("Enter name");
        userName = scanner.nextLine();

        if (userName.toUpperCase().equals("ALICE") || userName.toUpperCase().equals("BOB")){
            System.out.println("Welcome " + userName.toUpperCase() + " ");
        } else {
            System.out.println("Invalid User. Goodbye.");
        }
    }
}
