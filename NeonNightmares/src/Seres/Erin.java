package Seres;

public class Erin extends Producao{

    private int fortitude;
    private int iniciativa;
    private int percepcao;
    private int reflexos;
    private int vontade;
    private int ocultismo;

    public Erin() {
    }

    public Erin(String nome, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int defesa, int fortitude, int iniciativa, int percepcao, int reflexos, int vontade, int ocultismo) {
        super(nome, agilidade, intelecto, vigor, presenca, forca, pv, defesa);
        this.fortitude = fortitude;
        this.iniciativa = iniciativa;
        this.percepcao = percepcao;
        this.reflexos = reflexos;
        this.vontade = vontade;
        this.ocultismo = ocultismo;
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

    public int getOcultismo() {
        return ocultismo;
    }

    public void setOcultismo(int ocultismo) {
        this.ocultismo = ocultismo;
    }
}
