import java.util.Scanner;
public class count_no_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int noOfDigit=0;
        int original_n=n;

        while (n>0){
            n=n/10;
            noOfDigit++;
        }
        System.out.println("no. of digit " +  original_n + "="+noOfDigit);
    }
}
