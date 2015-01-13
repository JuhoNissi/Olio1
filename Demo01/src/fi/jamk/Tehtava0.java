/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.util.Scanner;

/**
 *
 * @author h9321
 */
public class Tehtava0 {
    //JRE: Tehtava0.main(taulukon)
    public static void main(String args[]){
        //kysy käyttäjältä luku
        int luku;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna luku >");
        luku = scanner.nextInt();
        //tulosta lukua vastaava sana
        switch (luku){
            case 1: System.out.println("Yksi"); break;
            case 2: System.out.println("Kaksi"); break;
            case 3: System.out.println("Kolme"); break;
            default: System.out.println("Joku muu luku");
        }
    }
}
