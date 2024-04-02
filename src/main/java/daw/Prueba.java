/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.List;

/**
 *
 * @author Víctor
 */
public class Prueba {

    public static void main(String[] args) {
//        Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una 
//        lista y muéstralas por pantalla. 
        List<App> lista = Metodos.generarLista50();
        System.out.println(lista);
//        Guarda los datos de todas las App de la lista, en un fichero de texto 
//        llamado aplicacionestxt.csv, dentro del directorio “./appscsv”.
        Escritura.crearDirectorio();
        Escritura.generarFicheroCSV(lista);
    }
}
