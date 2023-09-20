package Seres;

public class Hermes extends Personagens{

    private int acrobacia;
    private int atualidades;
    private int crime;
    private int fortitude;
    private int furtividade;
    private int intimidacao;
    private int pontaria;
    private int reflexos;
    private int sobrevivencia;
    private int vontade;

    public Hermes() {
    }

    public Hermes(String nome, String origem, String classe, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int sanidade, int pe, int energia, int defesa, int acrobacia, int atualidades, int crime, int fortitude, int furtividade, int intimidacao, int pontaria, int reflexos, int sobrevivencia, int vontade) {
        super("Hermes", "Criminoso", "Especialista", 3, 2, 1, 2, 1, 17, 16, 1, 5, 18);
        this.acrobacia = 1;
        this.atualidades = 1;
        this.crime = 5;
        this.fortitude = 1;
        this.furtividade = 5;
        this.intimidacao = 1;
        this.pontaria = 1;
        this.reflexos = 1;
        this.sobrevivencia = 2;
        this.vontade = 1;
    }


    public int getAcrobacia() {
        return acrobacia;
    }

    public void setAcrobacia(int acrobacia) {
        this.acrobacia = acrobacia;
    }

    public int getAtualidades() {
        return atualidades;
    }

    public void setAtualidades(int atualidades) {
        this.atualidades = atualidades;
    }

    public int getCrime() {
        return crime;
    }

    public void setCrime(int crime) {
        this.crime = crime;
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

    public int getIntimidacao() {
        return intimidacao;
    }

    public void setIntimidacao(int intimidacao) {
        this.intimidacao = intimidacao;
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

    public int getSobrevivencia() {
        return sobrevivencia;
    }

    public void setSobrevivencia(int sobrevivencia) {
        this.sobrevivencia = sobrevivencia;
    }

    public int getVontade() {
        return vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }
}
