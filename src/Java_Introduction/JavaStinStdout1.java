package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 14-02-2022
 * Time: 22:06
 */

import java.util.Scanner;

public class JavaStinStdout1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        int myInt = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(a);
    }
}
