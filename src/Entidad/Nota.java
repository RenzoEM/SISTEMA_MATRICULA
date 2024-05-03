
package Entidad;


public class Nota {
    String  dniEst;
    String curso;
    String calificacion;
    String condicion;

    public Nota(String dniDuenio, String nombre, String edad, String condicion) {
        this.dniEst = dniDuenio;
        this.curso = nombre;
        this.calificacion = edad;
        this.condicion = condicion;
    }

    public String getDniEst() {
        return dniEst;
    }

    public void setDniEst(String dniEst) {
        this.dniEst = dniEst;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    
    
}
