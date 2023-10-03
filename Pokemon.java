public class Pokemon {
    private String nome;
    private String tipo;
    private int saude;

    public Pokemon(String nome, String tipo, int saude) {
        this.nome = nome;
        this.tipo = tipo;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }
}
