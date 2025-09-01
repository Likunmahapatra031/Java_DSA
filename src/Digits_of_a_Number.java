import java.util.Scanner;
public class Digits_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int digit=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            digit++;
        }
        int div=(int)Math.pow(10,digit -1);
        while (n!=0){
            int q = n/div;
            System.out.println(q);

            n= n%div;
            div = div/10;


        }
    }
}
