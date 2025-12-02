public class SuporteTecnico implements Departamento{
    private static SuporteTecnico instancia = new SuporteTecnico();

    private SuporteTecnico() {}

    public static SuporteTecnico getInstancia() {
        return instancia;
    }

    public String receberChamado(String descricao) {
        return "O Suporte Técnico está tratando o chamado: " + descricao + ". Prazo de 48h.";
    }

    public String receberElogio(String mensagem) {
        return "O Suporte Técnico agradece o reconhecimento: " + mensagem;
    }

    public String receberRelatorio(String dados) {
        return "O Suporte Técnico vai analisar o relatório de incidentes: " + dados;
    }
}
