package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-02-2022
 * Time: 23:09
 */

import java.util.Scanner;

public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                result += (Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
