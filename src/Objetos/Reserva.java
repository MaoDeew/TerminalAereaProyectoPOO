package Objetos;

import java.io.Serializable;

public abstract class Reserva implements Serializable{
    
    Pasajero pasajero;
    String numeroPuesto;
    String modoPago;
    Vuelo vueloPasajero;

    public Reserva(Vuelo vueloPasajero,Pasajero pasajero, String numeroPuesto, String modoPago) {
        this.vueloPasajero = vueloPasajero;
        this.pasajero = pasajero;
        this.numeroPuesto = numeroPuesto;
        this.modoPago = modoPago;
    }
  
    abstract public String tipoPuesto();
    abstract int valorPuesto();

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String getNumeroPuesto() {
        return numeroPuesto;
    }

    public String getModoPago() {
        return modoPago;
    }

    public Vuelo getVueloPasajero() {
        return vueloPasajero;
    }
    
    
    
    
    
}
