/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Víctor
 */
public class Prueba {

    public static void main(String[] args) throws JAXBException, IOException {
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
        Directorios.crearDirectorio("appsxml");
        EscribirCatalogoAppsXML.generarCatalogoAppCML(lista);

//      Guarda los datos de todas las App de la lista, en un fichero JSON 
//      llamado aplicacionesxml.json, dentro del directorio “./appsjson”. 
//      Ayúdate del ejemplo del repositorio de clase. Incluye las dependencias 
//      necesarias en el pom.xml.
        Directorios.crearDirectorio("appsjson");
        EscrituraJSON.generarJSON(lista);

//        Crea una carpeta “./copias” y realiza una copia de los ficheros anteriores dentro de ella. 

        Directorios.crearDirectorio("copias");
        Copias.copiarFicheros("./appscsv/aplicacionestxt.csv", "./copias/copia1.csv");
        //Copiar mas de un archivo en una carpeta
        File carpeta = new File("./appscsv2");
        File[] array = carpeta.listFiles();
        
        for (File file : array) {
            Copias.copiarFicheros("./appscsv2/"+file.getName(), "./copias/"+file.getName());
        }
//        
//        En una carpeta “./aplicaciones” crea un archivo de texto por cada 
//                aplicación que haya en la lista. El archivo se llamará igual 
//                        que la app y contendrá los datos de la aplicación, 
//                        separando los campos por el carácter (;).

        Directorios.crearDirectorio("aplicaciones");
        Escritura.generarFicheroTXTPorObjeto(lista);
    }
}
