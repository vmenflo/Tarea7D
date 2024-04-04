/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author Víctor
 */
public class Escritura {
    //METODOS   
//    Guarda los datos de todas las App de la lista, en un fichero de texto llamado 
//            aplicacionestxt.csv, dentro del directorio “./appscsv”.

    //Método para guardar el archivo en el directorio especificado
    public static void generarFicheroCSV(List<App> lista) {

        // Bucle para crear el archivo por cada linea de la lista
        for (int i = 0; i < lista.size(); i++) {

            try {
                Files.write(Paths.get("./appscsv/aplicacionestxt.csv"), (lista.get(i) + "\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
    
//Crea un directorio, "./appscsv2", donde se guarden en archivos individuales CSV,
//los datos de cada una de las aplicaciones. En este directorio deben generarse 
//50 ficheros con el nombre que tenga la aplicación en su atributo.
    
    public static void generarFicheroPorObjeto(List<App> lista){
        for (int i = 0; i < lista.size(); i++) {
            //Cambiando el nombre del archivo creara csv individuales
            try {
                Files.write(Paths.get("./appscsv2/"+lista.get(i).getNombre()+".csv"), (lista.get(i) + "\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
    
 public static void generarFicheroTXTPorObjeto(List<App> lista){
        for (int i = 0; i < lista.size(); i++) {
            //Cambiando el nombre del archivo creara csv individuales
            try {
                Files.write(Paths.get("./aplicaciones/"+lista.get(i).getNombre()+".txt"), (lista.get(i) + "\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
    
}
