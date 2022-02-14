package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 14-02-2022
 * Time: 22:08
 */

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 == 0) {
            if (input > 20 || input <= 5) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }

        } else {
            System.out.println("Weird");
        }
    }
}
