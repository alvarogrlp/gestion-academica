package es.ies.puerto;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
