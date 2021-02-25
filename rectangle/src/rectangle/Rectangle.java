/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author Ronald Galicia
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo
        Scanner scan = new Scanner(System.in);
        int alto = 0, ancho = 0;
        
        System.out.print("Proporciona el alto: ");
        alto = scan.nextInt();
        System.out.print("Proporciona el ancho: ");
        ancho = scan.nextInt();
        
        int area = alto * ancho;
        System.out.println("Area: " + area);
        int perimetro = (alto + ancho)*2;
        System.out.println("Perimetro: " + perimetro);
    }
    
}
