package Objetos;

import java.io.Serializable;

public class ReservaEjecutivo extends Reserva implements Serializable{
    int valorPuesto;

    public ReservaEjecutivo(Vuelo vueloPasajero, Pasajero pasajero, String numeroPuesto, String modoPago, int valorPuesto) {
        super(vueloPasajero, pasajero, numeroPuesto, modoPago);
        this.valorPuesto = valorPuesto;
    }


    @Override
    public String tipoPuesto() {
        return "Ejecutivo";
    }

    @Override
    int valorPuesto() {
        return valorPuesto;
    }
    
}
