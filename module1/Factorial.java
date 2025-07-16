package module1;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scanner.nextInt();
        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("The factorial of is " + factorial);
        scanner.close();

    }

}
