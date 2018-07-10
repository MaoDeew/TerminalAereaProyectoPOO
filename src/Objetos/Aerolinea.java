package Objetos;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Aerolíneas. Cada aerolínea, tiene un nombre y un código. El código debe ser
 * único para cada aerolínea y no debe superar una longitud de seis (6)
 * caracteres. Dos aerolíneas no pueden tener el mismo código.
 *
 */
public class Aerolinea implements Serializable{

    private String nombre;
    private String codigo;

    public Aerolinea(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

}
