import java.util.Scanner;
import java.math.BigDecimal;
class Main {
 public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    BigDecimal big = new BigDecimal(a);
    BigDecimal decimal = new BigDecimal(b);

    int division = a / b;
    int remainder = a % b;
    double Floatingpoint = (double)a / (double)b;

    String str = String.format("%.16f",Floatingpoint);
    System.out.println(division + " " + remainder + " " + str);
 }
}
