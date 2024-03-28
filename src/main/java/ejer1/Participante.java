package ejer1;

public class Participante {
    private String nombreParticipante;
    private String apellidoParticipante;
    private int puntos=0;

    public Participante(String nombreParticipante, String apellidoParticipante, int puntos) {
        this.nombreParticipante = nombreParticipante;
        this.apellidoParticipante = apellidoParticipante;
        this.puntos = puntos;
    }

    public void sumar(int puntoInicio) {
        puntos=+puntoInicio;
    }
}
