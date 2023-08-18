import java.util.Scanner;

public class Q4CountSetBits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int count=0;
        // using Kernighan's algorithm
        while(num!=0){
            num=(num & (num-1));
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
