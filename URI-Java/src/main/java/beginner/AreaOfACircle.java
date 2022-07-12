/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author esmer
 */
public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Math.PI;
        double R = Double.parseDouble(sc.next());
        double A = n * (Math.pow(R, 2));

        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("A=" + df.format(A));
    }
}
