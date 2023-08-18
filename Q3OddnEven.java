import java.util.Scanner;

public class Q3OddnEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();


        if((n&1) ==0){
            System.out.println(n+ " is even");
        }
        else{
            System.out.println(n+" is odd");
        }
        sc.close();
    }
}