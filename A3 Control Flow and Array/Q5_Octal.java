import java.util.Scanner;

public class Q5_Octal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your number (decimal): ");
        int num = sc.nextInt();
        System.out.println("Your number in Octal system: " + String.format("%o", num));
        sc.close();
    }
}