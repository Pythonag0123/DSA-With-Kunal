package Assignment1;
import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a = sc.nextFloat();
        System.out.println("Enter the second number:");
        float b = sc.nextFloat();
        if(a>b){
            System.out.println( a +" is larger number");
        }
        else{
            System.out.println(b + " is a larger number");
        }
        sc.close();
    }
    
}
