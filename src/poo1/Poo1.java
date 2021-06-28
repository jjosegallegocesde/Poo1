/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

/**
 *
 * @author Juan
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Clase1 objeto = new Clase1("Juan",10,1.0,false);
        
        System.out.println("El primer atributo es: "+objeto.variable1);
        System.out.println("El segundo atributo es: "+objeto.variable2);
        System.out.println("El tercer atributo es: "+objeto.variable3);
        System.out.println("El cuarto atributo es: "+objeto.variable4);
        
        objeto.funcion1();
        System.out.println("La funcion 2 retorna: "+objeto.funcion2());
        System.out.println("La funcion 3 retorna: "+objeto.funcion3());
        
        
        
    }
    
}
