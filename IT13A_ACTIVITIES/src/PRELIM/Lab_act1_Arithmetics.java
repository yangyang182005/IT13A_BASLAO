/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

/**
 *
 * @author Admin
 */
public class Lab_act1_Arithmetics {
    public static void main(String[] args){
        int m = 10;
        int n = 4;
        int o = 6;
        int p = 3;
        
        int mac = m * n + o;
        int mal = (m - n) % o;
        int mas = (m + n + o) / p;
        int map = m * o - (n * n);
        
        System.out.println("10 * 4 + 6 = " + mac);
        System.out.println(" (10 - 4) % 6 = " + mal);
        System.out.println("(10 + 4 + 6) / 3 = " + mas);
        System.out.println("10 * 6 - (4 * 4 ) = " + map);
    
}
    
}
