package es.ies.puerto;

public class Estudiante extends Persona {
    private String matricula;

    /**
     * Constructor vacio
     */
    public Estudiante() {
    }
    /**
     * Constructor de estudiante
     * @param matricula
     * @param nombre
     * @param id
     */
    public Estudiante(String matricula, String nombre, String id) {
        super(id, nombre);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
