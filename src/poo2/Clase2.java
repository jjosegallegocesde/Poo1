/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author Juan
 */


import poo1.Clase1;

public class Clase2 {
    
    //ATRIBUTOS
    
    String variable22="soy una cadena de la clase 2";
    int variable33=55;
    
    
    //METODO ESPECIAL CONSTRUCTOR
    public Clase2(String variable1, int variable2){
        
        this.variable22=variable1;
        this.variable33=variable2;
        
        
    }
    
    
    public static void main(String[] args) {
        
        Clase1 objeto = new Clase1("juan",5,5.5,true);
        
        objeto.variable1="jose";
        
    }
    
    
}
