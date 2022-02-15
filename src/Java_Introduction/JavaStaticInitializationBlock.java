package Java_Introduction;/*
 * Author Name: Manish Raj
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-02-2022
 * Time: 23:17
 */

import java.util.Scanner;

public class JavaStaticInitializationBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short B = sc.nextShort();
        short H = sc.nextShort();
        if (H >= 0 && H < 100 && B < 100 && B >= 0) {
            int areaOfParallelogram = B * H;
            System.out.println(areaOfParallelogram);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
}
