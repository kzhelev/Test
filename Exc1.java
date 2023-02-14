package Proverki;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double result = 0;

        char z = scanner.next().charAt(0);

        switch (z) {
            case '+':
                result = x + y;
                if (x == (int) x && y == (int) y ) {
                    System.out.printf("%.0f + %.0f = %.0f", x, y, result);
                    break;
                } else if (x != (int)x && y != (int)y) {
                    System.out.printf("%.3f + %.3f = %.3f", x, y, result);
                    break;
                } else if (x == (int)x && y != (int)y) {
                    System.out.printf("%.0f + %.3f = %.3f", x, y, result);
                    break;
                } else if (x != (int)x && y == (int)y) {
                    System.out.printf("%.3f + %.0f = %.3f", x, y, result);
                    break;}
            case '-':
                result = x - y;
                if (x == (int) x && y == (int) y ) {
                    System.out.printf("%.0f - %.0f = %.0f", x, y, result);
                    break;
                } else if (x != (int)x && y != (int)y) {
                    System.out.printf("%.3f - %.3f = %.3f", x, y, result);
                    break;
                } else if (x == (int)x && y != (int)y) {
                    System.out.printf("%.0f - %.3f = %.3f", x, y, result);
                    break;
                } else if (x != (int)x && y == (int)y) {
                    System.out.printf("%.3f - %.0f = %.3f", x, y, result);
                    break;}
            case '/':
                result = x / y;
                if (x == (int) x && y == (int) y ) {
                    System.out.printf("%.0f / %.0f = %.0f", x, y, result);
                    break;
                } else if (x != (int)x && y != (int)y) {
                    System.out.printf("%.3f / %.3f = %.3f", x, y, result);
                    break;
                } else if (x == (int)x && y != (int)y) {
                    System.out.printf("%.0f / %.3f = %.3f", x, y, result);
                    break;
                } else if (x != (int)x && y == (int)y) {
                    System.out.printf("%.3f / %.0f = %.3f", x, y, result);
                    break;}
            case '*':
                result = x * y;
                if (x == (int) x && y == (int) y ) {
                    System.out.printf("%.0f * %.0f = %.0f", x, y, result);
                    break;
                } else if (x != (int)x && y != (int)y) {
                    System.out.printf("%.3f * %.3f = %.3f", x, y, result);
                    break;
                } else if (x == (int)x && y != (int)y) {
                    System.out.printf("%.0f * %.3f = %.3f", x, y, result);
                    break;
                } else if (x != (int)x && y == (int)y) {
                    System.out.printf("%.3f * %.0f = %.3f", x, y, result);
                    break;}
        }
//asdasd adqwe das qwd
        if(1 == 1) {

        }
    }
}
