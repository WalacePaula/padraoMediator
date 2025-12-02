import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnalistaTest {
    @Test
    void deveElogiarSuporte() {
        Analista analista = new Analista();

        assertEquals("O Sistema de Chamados registrou seu elogio.\n" +
                        "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                        ">>O Suporte Técnico agradece o reconhecimento: Atendimento nota 10",
                analista.elogiarSuporte("Atendimento nota 10"));
    }

    @Test
    void deveAbrirChamadoSuporte() {
        Analista analista = new Analista();

        assertEquals("O Sistema de Chamados registrou sua solicitação.\n" +
                        "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                        ">>O Suporte Técnico está tratando o chamado: Computador travando. Prazo de 48h.",
                analista.abrirChamadoSuporte("Computador travando"));
    }

    @Test
    void deveEnviarRelatorioSuporte() {
        Analista analista = new Analista();

        assertEquals("O Sistema de Chamados encaminhou seu relatório.\n" +
                        "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                        ">>O Suporte Técnico vai analisar o relatório de incidentes: Incidente de rede na filial X",
                analista.enviarRelatorio("Incidente de rede na filial X"));
    }
}
