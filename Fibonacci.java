import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the 1st Number = ");
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        System.out.print("Enter the 2nd Number = ");
        int num2 = s1.nextInt();
        System.out.print("Enter the range of number you want series = ");
        int value = s1.nextInt();
        int num3, i;

        System.out.print(num1 + " " + " " + num2);
        for (i = 2; i <= value; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;

        }
    }
}
