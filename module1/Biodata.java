package module1;
import java.util.Scanner;
public class Biodata {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        long mobileNumber;
        double cgpa,attendancePercentage;
        //name
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        //age
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        //mobile number
        System.out.println("Enter your mobile number:");
        mobileNumber = scanner.nextLong();
        //cgpa
        System.out.println("Enter your CGPA:");
        cgpa = scanner.nextDouble();
        //attendance percentage
        System.out.println("Enter your attendance percentage:");
        attendancePercentage = scanner.nextDouble();
        //displaying all the information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance Percentage: " + attendancePercentage);
    }
}