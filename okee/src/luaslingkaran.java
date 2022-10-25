/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class luaslingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            double r, luas, phi = 3.14;
        System.out.print("Masukkan Jari-Jari Lingkaran ");
            r = scan.nextDouble();
            luas = phi * r * r;
        System.out.println("Luas Lingkaran adalah "+luas);
    }
}
