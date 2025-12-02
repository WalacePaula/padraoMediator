public class Funcionario {
    public String elogiarSuporte(String mensagem) {
        return SistemaDeChamados.getInstancia().receberElogioSuporte(mensagem);
    }

    public String abrirChamadoSuporte(String descricao) {
        return SistemaDeChamados.getInstancia().receberChamadoSuporte(descricao);
    }

    public String enviarRelatorio(String dados) {
        return SistemaDeChamados.getInstancia().enviarRelatorioSuporte(dados);
    }
}
