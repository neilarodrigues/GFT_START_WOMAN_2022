public class Mensagem {

    private String texto;

    private Reacoes reacao;

    public Mensagem(String texto, Reacoes reacao) {
        this.texto = texto;
        this.reacao = reacao;
    }

    public String getTexto() {
        return texto;
    }

    public Reacoes getReacao() {
        return reacao;
    }


}