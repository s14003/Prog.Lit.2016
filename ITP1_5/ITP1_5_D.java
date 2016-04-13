import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int number = scan.nextInt();
        int a = 1;
        int b = 0;
        int count = 0;
        if (number > 3 && number < 10000) {
            for (;count < number; count++) {
                b = a/10;
                if (number / 3 == 0){
                    sb.append(" ")
                        .append(a);
                } else {
                    while(b != 0) {
                        if (b % 10 == 3) {
                            sb.append(" ")
                                .append(a);
                            break;
                        }
                        b /= 10;
                    }
                }
                a++;
            }
            System.out.println(sb);
        }
    }
}
