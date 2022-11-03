import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */

public class Program15_LeftTriangleStar {
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int a = scanner.nextInt();
        leftTriangle(a);
        //closing scanner
        scanner.close();
    }
}
