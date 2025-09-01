import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Reverse_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int digit=n%10;
            n=n/10;
            System.out.println(digit);
        }


    }
}
