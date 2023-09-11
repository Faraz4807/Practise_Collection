import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner sc=new Scanner(System.in);
       
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sm = " + c);
         sc.close();
    }
    
}
