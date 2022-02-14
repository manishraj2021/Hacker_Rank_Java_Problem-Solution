package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 14-02-2022
 * Time: 22:14
 */

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
