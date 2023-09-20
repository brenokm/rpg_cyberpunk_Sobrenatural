package Seres;

public class Nero extends Personagens{

    private int atualidades;
    private int ciencias;
    private int diplomacia;
    private int intuicao;
    private int investigacao;
    private int percepcao;
    private int reflexos;
    private int vontade;

    public Nero() {
    }

    public Nero(String nome, String origem, String classe, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int sanidade, int pe, int energia, int defesa, int atualidades, int ciencias, int diplomacia, int intuicao, int investigacao, int percepcao, int reflexos, int vontade) {
        super("Nero", "Acadêmico", "Especialista", 2, 3, 1, 2, 1, 17, 16, 1, 5, 17);
        this.atualidades = 2;
        this.ciencias = 5;
        this.diplomacia = 2;
        this.intuicao = 2;
        this.investigacao = 5;
        this.percepcao = 1;
        this.reflexos = 1;
        this.vontade = 2;
    }

    public int getAtualidades() {
        return atualidades;
    }

    public void setAtualidades(int atualidades) {
        this.atualidades = atualidades;
    }

    public int getCiencias() {
        return ciencias;
    }

    public void setCiencias(int ciencias) {
        this.ciencias = ciencias;
    }

    public int getDiplomacia() {
        return diplomacia;
    }

    public void setDiplomacia(int diplomacia) {
        this.diplomacia = diplomacia;
    }

    public int getIntuicao() {
        return intuicao;
    }

    public void setIntuicao(int intuicao) {
        this.intuicao = intuicao;
    }

    public int getInvestigacao() {
        return investigacao;
    }

    public void setInvestigacao(int investigacao) {
        this.investigacao = investigacao;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getReflexos() {
        return reflexos;
    }

    public void setReflexos(int reflexos) {
        this.reflexos = reflexos;
    }

    public int getVontade() {
        return vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }
}
