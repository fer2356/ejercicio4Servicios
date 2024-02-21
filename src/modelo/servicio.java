package modelo;

import java.time.LocalDate;

public abstract class servicio { //clase padre

    String trabajador;
    LocalDate FechaInicio;

    protected String Cliente;

    public servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }
    //creando metodos o haciendo interface


}
