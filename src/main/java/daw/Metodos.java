/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Víctor
 */
public class Metodos {
    //Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una 
    //lista y muéstralas por pantalla. 
    public static List<App> generarLista50(){
        //Creamos la lista que se devolverá
        List<App> lista = new ArrayList();
        //Bucle para generar 50 objetos y meterlos en la lista
        for(int i=0; i<50;i++){
            App temporal = new App();
            lista.add(temporal);
        }
        return lista;
    }
}
