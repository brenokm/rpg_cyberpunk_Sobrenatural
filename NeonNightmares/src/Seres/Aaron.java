package Seres;

public class Aaron extends Producao{
    private int fortitude;
    private int furtividade;
    private int iniciativa;
    private int percepcao;
    private int reflexos;
    private int vontade;

    public Aaron() {
    }

    public Aaron(String nome, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int defesa, int fortitude, int furtividade, int iniciativa, int percepcao, int reflexos, int vontade) {
        super(nome, agilidade, intelecto, vigor, presenca, forca, pv, defesa);
        this.fortitude = fortitude;
        this.furtividade = furtividade;
        this.iniciativa = iniciativa;
        this.percepcao = percepcao;
        this.reflexos = reflexos;
        this.vontade = vontade;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
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
