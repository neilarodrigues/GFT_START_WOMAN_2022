public enum Reacoes {

    CURTIR("curtir"),
    CORACAO("coracao"),
    GARGALHADA("gargalhada"),
    SURPRESO("surpreso"),
    TRISTE("triste"),
    BRAVO("bravo");

    private String descricao;

    Reacoes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}