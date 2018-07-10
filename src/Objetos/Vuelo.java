package Objetos;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 * Vuelos. Cada vuelo tiene un aeropuerto de origen y destino, un número de
 * vuelo y una fecha y hora de salida. Adicionalmente, cada vuelo tiene un
 * código que está dado por un máximo de 7 caracteres alfanuméricos.
 *
 */
public class Vuelo implements Serializable {

    private String codigoVuelo;
    private Aerolinea aerolinea;
    private int precioClaseEjecutiva;
    private int precioClaseEconomica;
    private Aeropuerto origenTrayecto;
    private Aeropuerto destinoTrayecto;
    private String fechaOrigen;
    private String fechaDestino;
    private String horaOrigen;
    private String horaDestino;

    private NumberFormat conMoneda;

    public Vuelo() {
    }
    
    

    public Vuelo(String codigoVuelo, Aerolinea aerolinea,
            int precioClaseEjecutiva, int precioClaseEconomica, Aeropuerto origenTrayecto, Aeropuerto destinoTrayecto,
            String fechaOrigen, String fechaDestino, String horaOrigen, String horaDestino) {

        conMoneda = NumberFormat.getCurrencyInstance();

        this.codigoVuelo = codigoVuelo;
        this.aerolinea = aerolinea;
        this.precioClaseEjecutiva = precioClaseEjecutiva;
        this.precioClaseEconomica = precioClaseEconomica;
        this.origenTrayecto = origenTrayecto;
        this.destinoTrayecto = destinoTrayecto;
        this.fechaOrigen = fechaOrigen;
        this.fechaDestino = fechaDestino;
        this.horaOrigen = horaOrigen;
        this.horaDestino = horaDestino;
    }

    
    
    
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }


    public String getPrecioPantallaEjecutiva() {
        String precio = conMoneda.format(precioClaseEjecutiva);
        return precio;
    }


    public String getPrecioPantallaEconomica() {
        String precio = conMoneda.format(precioClaseEconomica);
        return precio;
    }

    public Aeropuerto getOrigenTrayecto() {
        return origenTrayecto;
    }

    public Aeropuerto getDestinoTrayecto() {
        return destinoTrayecto;
    }

    public String getFechaOrigen() {
        return fechaOrigen;
    }

    public String getFechaDestino() {
        return fechaDestino;
    }

    public String getHoraOrigen() {
        return horaOrigen;
    }

    public String getHoraDestino() {
        return horaDestino;
    }

    public int getPrecioClaseEjecutiva() {
        return precioClaseEjecutiva;
    }

    public int getPrecioClaseEconomica() {
        return precioClaseEconomica;
    }
    
    

    @Override
    public String toString() {
        return "Numero de vuelo: " + codigoVuelo
                + "\n Aerolinea: " + aerolinea.getNombre()
                + "\nPrecio Clase Ejecutiva: " + getPrecioPantallaEjecutiva()
                + "\nPrecio Clase Economica: " + getPrecioPantallaEconomica()
                + "\nAeropuerto de origen: " + origenTrayecto.getNombre() + "," + origenTrayecto.getCiudad() + "\nFecha de Partida: " + fechaOrigen + "\nHora de Partida: " + horaOrigen
                + "\nAeropuerto destino: " + destinoTrayecto.getNombre() + "," + destinoTrayecto.getCiudad() + "\nFecha de Regreso: " + fechaDestino + "\nHora de Regreso: " + horaDestino;

    }

}
