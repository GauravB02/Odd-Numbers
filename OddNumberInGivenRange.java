import java.util.Scanner;
public class OddNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number for the range");
        int num1 = sc.nextInt();
        System.out.println("Enter first number for the range");
        int num2 = sc.nextInt();
        System.out.println("Displaying odd numbers between "+num1+" and "+num2);
        for (int i = num1;i<=num2;i++){
            int a = i%2;
            if (a==1)
        System.out.println(i);
        }

    }
}
