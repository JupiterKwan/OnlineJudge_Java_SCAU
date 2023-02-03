import java.util.Scanner;
public class C_18140_NumberOfDigits_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        while(a >= 10){
            a /= 10;
            ++i;
        }
        System.out.println(i);
    }
}