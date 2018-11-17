package co.edu.konrad.mediokapp.entities;

public class Jornada {
    private int idJornada;
    private String nombreJornada;

    public Jornada(int idJornada, String nombreJornada) {
        this.idJornada = idJornada;
        this.nombreJornada = nombreJornada;
    }

    public Jornada() {
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public String getNombreJornada() {
        return nombreJornada;
    }

    public void setNombreJornada(String nombreJornada) {
        this.nombreJornada = nombreJornada;
    }

    @Override
    public String toString() {
        return nombreJornada;
    }
}
