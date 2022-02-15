package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-02-2022
 * Time: 23:08
 */

import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
