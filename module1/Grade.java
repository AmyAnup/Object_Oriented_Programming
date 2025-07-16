package module1;
import java.util.*;
public class Grade {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in three subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int total = sub1 + sub2 + sub3;
        float percentage = (float) total / 3;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 60) {
            System.out.println("Grade: A");
        } else if (percentage >= 50) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
        sc.close();
    }
}
