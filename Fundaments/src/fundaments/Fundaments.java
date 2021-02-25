/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundaments;

import java.util.Scanner;

/**
 *
 * @author Ronald Galicia
 */
public class Fundaments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero par o impar?\n");
        
        System.out.print("Ingrese su numero= ");
        int num = Integer.parseInt(scan.nextLine());
        
        if(num % 2 == 0){
            System.out.println("ES NUMERO PAR");
        }else{
            System.out.println("ES NUMERO IMPAR");
        }
    }
    
}
