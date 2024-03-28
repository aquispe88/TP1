package ejer1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ConcursoTest {

    @Test
    public void inscriboParticipante() {

        //setup
        Concurso c = new Concurso("concurso2024", LocalDate.now(), LocalDate.now().plusDays(10));

        Participante p1 = new Participante("juan", "perez", 0);
        //ejercitacion
        c.inscribir(p1);

        //verificacion
        Assert.assertEquals(true,c.inscripto(p1));

    }
}