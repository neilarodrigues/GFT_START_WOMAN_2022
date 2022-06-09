public class MensagemImagem extends Mensagem {

    private String linkDaImagem;

    public MensagemImagem(String texto, Reacoes reacao, String linkDaImagem) {
        super(texto, reacao);
        this.linkDaImagem = linkDaImagem;
    }

    public String toString() {
        String mensagem = "";

        if (!super.getTexto().equals("")) {
            mensagem += "Mensagem: " + super.getTexto();
        }

        if (super.getReacao() != null) {
            mensagem += " Reação:" + super.getReacao().getDescricao();
        }

        if (!this.linkDaImagem.equals("")) {
            mensagem += " Link Imagem: " + this.linkDaImagem;
        }

        return mensagem;
    }

    public String getLinkDaImagem() {
        return linkDaImagem;
    }

    public void setLinkDaImagem(String linkDaImagem) {
        this.linkDaImagem = linkDaImagem;
    }

}