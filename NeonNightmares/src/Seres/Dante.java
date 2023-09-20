package Seres;

public class Dante extends Personagens{

    private int fortitude;
    private int iniciativa;
    private int intuicao;
    private int investigacao;
    private int percepcao;
    private int pontaria;
    private int reflexos;
    private int vontade;

    public Dante() {
    }

    public Dante(String nome, String origem, String classe, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int sanidade, int pe, int energia, int defesa, int fortitude, int iniciativa, int intuicao, int investigacao, int percepcao, int pontaria, int reflexos, int vontade) {
        super("Dante", "Policial", "Combatente", 1, 1, 3, 2, 2, 72, 33, 8, 32, defesa);
        this.fortitude = 1;
        this.iniciativa = 1;
        this.intuicao = 2;
        this.investigacao = 1;
        this.percepcao = 5;
        this.pontaria = 5;
        this.reflexos = 2;
        this.vontade = 1;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
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

    public int getPontaria() {
        return pontaria;
    }

    public void setPontaria(int pontaria) {
        this.pontaria = pontaria;
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
