import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    Administrador administrador;
    Servidor servidor;

    @BeforeEach
    void setUp() {
        administrador = new Administrador();
        servidor = new Servidor ();
    }

    @Test
    void deveAbrirSemestre() {
        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        administrador.executarTarefa(aberturaDoServidor);

        assertEquals("Servidor aberto", servidor.getSituacao());
    }

    @Test
    void deveFecharServidor() {
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);
        administrador.executarTarefa(fechamentoDoServidor);

        assertEquals("Servidor fechado", servidor.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaDoServidor = new AbrirServidor(servidor);
        Tarefa fechamentoDoServidor = new FecharServidor(servidor);

        administrador.executarTarefa(aberturaDoServidor);
        administrador.executarTarefa(fechamentoDoServidor);

        administrador.cancelarUltimaTarefa();

        assertEquals("Servidor aberto", servidor.getSituacao());
    }

}