/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.Lecturatxt;
import java.util.List;
import javax.swing.JOptionPane;

public class Logica {
    public boolean buscarEstPorDni(String dniBuscado) {
        Lecturatxt leer=new Lecturatxt();
        
    for (Entidad.Matricula duenio : leer.leerEst()) {
        if (duenio.getDni().equals(dniBuscado)) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "El estudiante con este DNI  no existe.", "Alerta", JOptionPane.WARNING_MESSAGE);
    return false;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
public String buscarNombreEstPorDni(String dniBuscado) {
    Lecturatxt leer =new Lecturatxt();
    for (Entidad.Matricula duenio : leer.leerEst()) {
        if (duenio.getDni().equals(dniBuscado)) {
            return duenio.getNombre();
        }
    }
    
    return null;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
 public boolean validar(String usuarioB, String password){
     Lecturatxt leer=new Lecturatxt();
     for (Entidad.Usuario usuario : leer.leerUsuarios()) {
        if (usuario.getUser().equals(usuarioB)) {
            
                return true;
            
        }
    }
     return false;
 }
}
