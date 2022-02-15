package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-02-2022
 * Time: 23:10
 */

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(n + " " + str);
            n++;
        }
    }
}
