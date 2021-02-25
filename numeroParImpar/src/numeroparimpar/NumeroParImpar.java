/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroparimpar;

import java.util.Scanner;

/**
 *
 * @author Ronald Galicia
 */
public class NumeroParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("NUMERO PAR O IMPAR?\n");
        
        System.out.print("Ingrese su numero: ");
        int number = Integer.parseInt(scan.nextLine());
        
        if(number % 2 == 0){
            System.out.println("El numero " + number + " es par");
        }else{
            System.out.println("El numero " + number + " es impar");
        }
    }
    
}
