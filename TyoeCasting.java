public class TyoeCasting {
    public static void main(String[] args) {
        
        // Assigning an integer value to a double variable
        int num1 = 45;
        double num2;
        num2 = num1; // Implicit type casting (int to double)
        System.out.println(num2); // Printing the double value of num2, which will be 45.0
        
        // Explicit type casting from double to int
        double t1 = 45.3654;
        int t2;
        t2 = (int)t1; // Casting t1 (double) to t2 (int)
        System.out.println(t2); // Printing the integer value of t2, which will be 45
    }
}
