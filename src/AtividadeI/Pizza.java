package AtividadeI;

public class Pizza{
    private String massa = "";
    private String tamanho = "";
    private String ingrediente = "";

    public Pizza(){}

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Massa: " + this.massa +
                "\nTamanho: " + this.tamanho +
                "\nSabor: " + this.ingrediente;
    }
}
