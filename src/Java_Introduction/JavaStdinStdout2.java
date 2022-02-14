package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 14-02-2022
 * Time: 22:11
 */

import java.util.Scanner;

public class JavaStdinStdout2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double d = sc.nextDouble();

        sc.nextLine();

        String str = sc.nextLine();

        // int b=sc.nextInt();
        System.out.println("String: " + str);

        System.out.println("Double: " + d);
        System.out.println("Int: " + a);
    }
}
