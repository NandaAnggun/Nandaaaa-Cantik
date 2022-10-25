
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
public class Kelilingsegitiga {
    public static void main(String[] args){
        int sisi;
        double keliling;
         Scanner hitung = new Scanner(System.in);
        
        System.out.println("program hitung luas segitiga");
        System.out.println("input alas");
        sisi = hitung.nextInt();
        
        keliling =(sisi+sisi+sisi);
        
        System.out.println("program hitung luas segitiga");
        System.out.println(keliling);

    }
}
