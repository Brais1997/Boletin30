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
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    
    
    void darMasaje(){
        System.out.println("El masajista da un masaje");
    }
}
