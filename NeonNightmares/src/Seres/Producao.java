package Seres;

public abstract class Producao {

    private String nome;
    private int agilidade;
    private int intelecto;
    private int vigor;
    private int presenca;
    private int forca;
    private int pv;
    private int defesa;

    public Producao() {

    }

    public Producao(String nome, int agilidade, int intelecto, int vigor, int presenca, int forca, int pv, int defesa) {
        this.nome = nome;
        this.agilidade = agilidade;
        this.intelecto = intelecto;
        this.vigor = vigor;
        this.presenca = presenca;
        this.forca = forca;
        this.pv = pv;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresença(int presenca) {
        this.presenca = presenca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
