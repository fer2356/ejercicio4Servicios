package modelo;

import java.time.LocalDate;

public class TrabajoPintura extends servicio {
    double superficie;
    double PrecioPintura;

    //crear constructor atributos padre


    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente,
                          double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double CosteMaterial() {
        return ((this.superficie / 7.8 * this.PrecioPintura));
    }

    public double CosteManoObra() {
        return ((this.superficie / 10) * 9.5);

    }


    private double costeAdicional() {
        if (superficie < 50) {
            return (CosteMaterial() + CosteManoObra()) * 0.15;
        } else {
            return 0;
        }
    }


    public String detalleServicio() {
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: " + Cliente + "\n";
        cadena += "Fecha de Inicio: " + FechaInicio + "\n";
        cadena += "------------------\n";
        cadena += "Pintor: " + trabajador + "\n";
        cadena += "Coste Material: " + CosteMaterial() + "\n";
        cadena += "Coste Mano Obra: " + CosteManoObra() + "\n";
        cadena += "Coste Adicional: " + costeAdicional() + "\n";
        cadena += "------------------\n";
        return cadena;


    }
}
