package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 17-02-2022
 * Time: 19:37
 */

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String str = Integer.toString(input);
        if (input == Integer.parseInt(str)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
