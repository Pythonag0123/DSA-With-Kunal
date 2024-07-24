package Assignment1;
import java.util.*;

public class rupeeToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE AMOUNT IN RUPEE:");
    double r = sc.nextDouble();
    double USD= (r*0.012);
    System.out.println("THE AMOUNT IN USD IS " + USD);
    sc.close();

        
    }
    
    
}
