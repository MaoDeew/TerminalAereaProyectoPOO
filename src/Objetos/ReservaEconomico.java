package Objetos;

import java.io.Serializable;


public class ReservaEconomico extends Reserva implements Serializable{
    int valorPuesto;

    public ReservaEconomico(Vuelo vueloPasajero, Pasajero pasajero, String numeroPuesto, String modoPago, int valorPuesto) {
        super(vueloPasajero, pasajero, numeroPuesto, modoPago);
        this.valorPuesto = valorPuesto;
    }

    
        
    @Override
    public String tipoPuesto() {
       return "Economico"; 
    }

    @Override
    int valorPuesto() {
        return valorPuesto;
    }
    
}
