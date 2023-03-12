
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt and collect an integer from the user
        int number = Integer.valueOf(scanner.nextLine());

        // set variables for start point and finish
        int start = number;
        int end = 100;

        // set a loop that counts up from the number given to 100
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
