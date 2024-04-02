/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author victor
 */
public class App {

    //Atributos
    public static int codigo;
    public static String[] prefijos = {"css", "hth", "ssh", "ty", "lop", "gss", "asd", "hyy", "jjt", "hol"};
    String nombre;
    String descripcion;
    double tamaño;
    int numeroDescargas;

    //Constructor parametrizado
    public App(String nombre, String descripcion, double tamaño, int numeroDescargas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.numeroDescargas = numeroDescargas;
    }

    //Constructor por defecto
    public App() {
        Random r = new Random();
        this.codigo = codigo++;
        this.nombre = "App" + this.codigo + (char) r.nextInt(97, 122);
        this.descripcion=prefijos[r.nextInt(0,11)];
        //this.tamaño=DoubleStream.builder(1,r.nextDouble(100.0,1024.0));
    }

}
