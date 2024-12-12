package es.ies.puerto;

public abstract class Persona {
    private String id;
    private String nombre;

    /**
     * Costructor vacio
     */
    public Persona() {
    }

    /**
     * Constructor de persona
     * @param id
     * @param nombre
     */
    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion que saluda
     * @return Saludo de la persona
     */
    public String saludar() {
        return "Hola, yo soy " +nombre;
    }
}
