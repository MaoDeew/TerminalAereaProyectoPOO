package Objetos;

import java.io.Serializable;

/**
 * Aeropuertos. Cada aeropuerto tiene un nombre y un código. El código debe ser
 * único para cada aeropuerto y debe consistir únicamente de tres (3) caracteres
 * alfabéticos. Dos aeropuertos no pueden tener el mismo código.
 *
 *
 */
public class Aeropuerto implements Serializable {

    private String nombre;
    private String ciudad;
    private String codigo;

    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
