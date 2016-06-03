/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author jota
 */
public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(int id,String nombre,String apellidos,int edad,int dorsal,String demarcacion){
        super(id,nombre,apellidos,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    
    public void entrevista(){
        System.out.println("El futbolista es entrevistado");
    }

    
    
    
}
