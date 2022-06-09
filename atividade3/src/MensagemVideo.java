public class MensagemVideo extends Mensagem {

    private String linkDoVideo;

    public MensagemVideo(String texto, Reacoes reacao, String linkDoVideo) {
        super(texto, reacao);
        this.linkDoVideo = linkDoVideo;
    }

    public String toString() {
        String mensagem = "";

        if (!super.getTexto().equals("")) {
            mensagem += "Mensagem: " + super.getTexto();
        }

        if (super.getReacao() != null) {
            mensagem += " Reação:" + super.getReacao().getDescricao();
        }

        if (!this.linkDoVideo.equals("")) {
            mensagem += " Link Video: " + this.linkDoVideo();
        }

        return mensagem;
    }
}