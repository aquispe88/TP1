package ejer1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String nombreConcurso;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private List<Participante> inscriptos;
    public Concurso(String nombreConcurso, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombreConcurso = nombreConcurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.inscriptos=new ArrayList<>();
    }

    public boolean inscripto(Participante participante){
        for (Participante p: inscriptos){
              if ( p.equals(participante)){
                  return  true;
              }

        }
        return false;
    }

    public void inscribir(Participante participante){
        if (!(compararFecha(LocalDate.now(),fechaInicio) && compararFecha2(LocalDate.now(),fechaFin))) throw new RuntimeException("la incripcion nose pudo hacer");
        if (fechaInicio.equals(LocalDate.now())){
            participante.sumar(10);
        }

        inscriptos.add(participante);

    }

    private boolean compararFecha(LocalDate f1,LocalDate f2){
       // return f1.compareTo(f2)==0 || f1.compareTo(f2)>0;
        // (f1==f2 || f1>f2);
        return f1.equals(f2)||f1.isAfter(f2);
    }

    private boolean compararFecha2(LocalDate f1, LocalDate f2){
        return f1.equals(f2)||f1.isBefore(f2);
    }


}
// oublic list<consurso> consurso concursio inicos(Localdate
//fecja inicio{retir¿¿urn filtro(concurso -> concunrso.empiza(fechaInicio))}  )