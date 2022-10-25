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

public class luaskeliling_persegipanjang {
    public static void main(String[] args){
        int panjang, lebar;
        double luas, keliling;
        Scanner input=new Scanner (System.in);
        
    System.out.print("Masukkan panjang ");
    panjang = input.nextInt();
    
    System.out.print("Masukkan Lebar ");
    lebar = input.nextInt();
    
    luas=panjang*lebar;
    System.out.println("Luas Persegi Panjang: "+luas);
    
    keliling=2*panjang*lebar;
    System.out.println("Keliling Persegi Panjang: "+keliling);
    }
}
