import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = s.nextInt(); //تقدرين تسمينها نفس اللي تحت لان برا السكوب
        System.out.println("enter second number");
        int num2 = s.nextInt();
        System.out.println("enter third number");
        int num3 = s.nextInt();
        int N = small(num1, num2, num3);
        System.out.println(N);


        String REGEX ="0"+ "1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "10";
        System.out.println("enter number to check");
        int num = s.nextInt();
        String C = check(num);
        System.out.println(C);
        System.out.println("enter password to check");
        String pass = s.next();
        String P = password(pass);

    }

    public static int small(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else return num3;
    }

    public static String check(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        } else return "zero";

    }

    public static String password(String pass) {
        if (pass.length() < 10) {
            return "false";

        }
        return "false";
    }
}


