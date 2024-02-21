package modelo;
public class RevisionAlarma extends servicio{
    int numAlarmsRevisar;

    public RevisionAlarma (String Cliente , int numAlarmsRevisar){
        super(Cliente);
        this.numAlarmsRevisar = numAlarmsRevisar;
        this.trabajador = "Revisor Especialista Contraincendios";
    }
}
