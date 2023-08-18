import java.util.Scanner;

public class Q2PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        if (isPowerOfTwo) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }
        sc.close();
        
    }
    
}
