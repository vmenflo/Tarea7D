/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Víctor
 */
public class Prueba {

    public static void main(String[] args) throws JAXBException {
//        Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una 
//        lista y muéstralas por pantalla. 
        List<App> lista = Metodos.generarLista50();
        System.out.println(lista);
//        Guarda los datos de todas las App de la lista, en un fichero de texto 
//        llamado aplicacionestxt.csv, dentro del directorio “./appscsv”.
        Directorios.crearDirectorio("appscsv");
        Escritura.generarFicheroCSV(lista);
        System.out.println(lista.size());
        
//        Crea un directorio, "./appscsv2", donde se guarden en archivos 
//        individuales CSV, los datos de cada una de las aplicaciones. En este 
//        directorio deben generarse 50 ficheros con el nombre que tenga la aplicación 
//        en su atributo.

        Directorios.crearDirectorio("appscsv2");
        Escritura.generarFicheroPorObjeto(lista);
        
//      Guarda los datos de todas las App de la lista, en un fichero XML llamado 
//      aplicacionesxml.xml, dentro del directorio “./appsxml”. Ayúdate del ejemplo del 
//      repositorio de clase. Incluye las dependencias necesarias en el pom.xml
        
        EscribirCatalogoAppsXML.generarCatalogoAppCML(lista);
    }
}
