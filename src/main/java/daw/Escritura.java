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

    //Crear directorio
    public static void crearDirectorio() {

        Path directorio = Paths.get("appscsv");

        try {
            Files.createDirectories(directorio);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear esta ruta");
        } catch (IOException e) {
            System.out.println("Problema creando el directorio ");
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }
    }
    //Método para guardar el archivo en el directorio especificado
    public static void generarFicheroCSV(List<App> lista) {

        // Bucle para crear el archivo
        for (int i = 0; i < lista.size(); i++) {

            try {
                Files.write(Paths.get("./appscsv/aplicacionestxt.csv"), (lista.get(i) + "\n").getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error creando el fichero");
            }
        }
    }
}
