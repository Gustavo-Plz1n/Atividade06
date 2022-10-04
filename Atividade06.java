/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double raio,pi=3.14, area;
        System.out.println("Insira o Raio");
        raio = leia.nextDouble();
        area = (pi*raio*raio);
        System.out.println("A area do seu circulo e de " + area);
        
        
        
        
    }
    
}
