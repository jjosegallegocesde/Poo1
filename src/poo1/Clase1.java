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
public class Clase1 {
    
    //ATRIBUTOS
    
    public String variable1="soy una cadena";
    int variable2=5;
    double variable3=5.5;
    boolean variable4=true;
    
    //METODO ESPECIAL CONSTRUCTOR
    public Clase1(String variable1, int variable2, double variable3, boolean variable4){
        
        this.variable1=variable1;
        this.variable2=variable2;
        this.variable3=variable3;
        this.variable4=variable4;

        
    }
    
    
    //METODOS
    void funcion1(){
        System.out.println("Hola soy funcion 1");
    }
    
    int funcion2(){
        
        return(10);
        
    }
    
    String funcion3(){
        String saludo="Hola... te hablo desde la función 3";
        return (saludo);
    }
    
}

