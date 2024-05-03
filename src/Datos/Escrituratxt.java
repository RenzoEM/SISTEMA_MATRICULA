/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidad.Matricula;
import Entidad.Nota;
import Entidad.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Escrituratxt {
    public void registrarEst(Matricula est) {
    String rutaArchivo = "estudiante.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo separados por comas
        writer.write(est.getNombre() + "," + est.getCelular() + "," + est.getEdad() + "," + est.getDireccion() + "," + est.getDni() + "\n");

        System.out.println("Registro guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
    public void registrarNota(Nota nota) {
        // Ruta del archivo donde se guardarán los registros
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(nota.getDniEst() + "," + nota.getCurso() + "," + nota.getCalificacion() + "," + nota.getCondicion() + "\n");

            System.out.println("Registro de mascota guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
    public  void registrarUsuario(Usuario usuario){
        String rutaArchivo = "usuario.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(usuario.getUser() + "," + usuario.getNombre() + "," + usuario.getPassword() +"\n");

            System.out.println("Registro de mascota guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
}
