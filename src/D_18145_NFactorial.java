import java.util.Scanner;
public class D_18145_NFactorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long result = n;
        for(int i = n; i > 1; i--){
            result = result * (i - 1);
        }
        System.out.println(result);
    }
}
