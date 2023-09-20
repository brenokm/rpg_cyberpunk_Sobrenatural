package Seres;

public class Luciano extends Producao{

    private int atletismo;
    private int fortitude;
    private int iniciativa;
    private int percepcao;
    private int reflexos;
    private int vontade;

    public Luciano() {
    }

    public Luciano(String nome, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int defesa, int atletismo, int fortitude, int iniciativa, int percepcao, int reflexos, int vontade) {
        super(nome, agilidade, intelecto, vigor, presenca, forca, pv, defesa);
        this.atletismo = atletismo;
        this.fortitude = fortitude;
        this.iniciativa = iniciativa;
        this.percepcao = percepcao;
        this.reflexos = reflexos;
        this.vontade = vontade;
    }

    public int getAtletismo() {
        return atletismo;
    }

    public void setAtletismo(int atletismo) {
        this.atletismo = atletismo;
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
