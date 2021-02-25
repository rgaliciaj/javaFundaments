/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundaments;



/**
 *
 * @author Ronald Galicia
 */
public class Fundaments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado = (1 > 2) ? "verdadero" : "false";
        System.out.println("resultado = " + resultado);
        
        int numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }
    
}
