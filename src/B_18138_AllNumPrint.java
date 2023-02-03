import java.util.Scanner;
public class B_18138_AllNumPrint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum;
        while(a >=100 && a < 1000){
            while(a > 0) {
                sum = a % 10;
                System.out.println(sum);
                a = a / 10;
            }
        }
    }
}