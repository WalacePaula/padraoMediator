public class SistemaDeChamados {
    private static SistemaDeChamados instancia = new SistemaDeChamados();

    private SistemaDeChamados() {}

    public static SistemaDeChamados getInstancia() {
        return instancia;
    }

    public String receberChamadoSuporte(String descricao) {
        return "O Sistema de Chamados registrou sua solicitação.\n"+
                "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberChamado(descricao);
    }

    public String receberElogioSuporte(String mensagem) {
        return "O Sistema de Chamados registrou seu elogio.\n"+
                "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberElogio(mensagem);
    }

    public String enviarRelatorioSuporte(String dados) {
        return "O Sistema de Chamados encaminhou seu relatório.\n"+
                "O Suporte Técnico respondeu conforme mensagem a seguir.\n" +
                ">>" + SuporteTecnico.getInstancia().receberRelatorio(dados);
    }
}
