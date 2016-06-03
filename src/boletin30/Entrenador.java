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
public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    void planificarEntrenamiento(){
        System.out.println("Planifica entrenamiento");
    }

    
    
    
    
}
