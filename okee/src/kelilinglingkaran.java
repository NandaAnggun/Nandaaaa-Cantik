
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class kelilinglingkaran {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
            double r, Keliling, phi = 3.14;
       System.out.print("Masukkan Jari-Jari Lingkaran ");
       r = scan.nextDouble();
       Keliling = 2 * phi * r;
       System.out.println("Keliling Lingkaran adalah "+Keliling);
   } 
}
