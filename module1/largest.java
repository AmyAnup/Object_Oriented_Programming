package module1;
import java.util.*;
public class largest{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the valuse of a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a is the largest");
        }else if(b>=a && b>=c){
            System.out.println("b is the largest");
        }else{
            System.out.println("c is the largest");
        }
        sc.close();
    }
}
