package Assignment1;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principal:");
        float p = sc.nextFloat();
        System.out.println("Enter the value of rate in per year :");
        float r = sc.nextFloat();
        System.out.println("Enter the value of time in year:");
        float t = sc.nextFloat();
        float  SI= (p*r*t)/100;
        System.out.println("Simple interest is :" + SI);
        sc.close();

    }
    
}
