/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author esmer
 */
public class Average1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = Float.parseFloat(sc.nextLine());
        float b = Float.parseFloat(sc.nextLine());
        float res = ((a*35)/100)+((b*75)/100);
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println("MEDIA = " + df.format(res));
    }
}
