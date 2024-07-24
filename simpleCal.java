package Assignment1;
import java.util.*;

public class simpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        System.out.println("Enter operator:");
        char c = sc.next().charAt(0);
        switch(c){
            case '+': System.out.println(num1 + num2);
            break;
            case '-':System.out.println(num1 - num2);
            break;
            case '*':System.out.println(num1 * num2);
            break;
            case '/':System.out.println(num1 / num2);
            break;

        }
        sc.close();
        


        

        
    }
}
