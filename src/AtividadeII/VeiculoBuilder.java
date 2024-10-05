package AtividadeII;

public class VeiculoBuilder {
    private Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(int rodas){
        this.veiculo.setRodas(rodas);
        return this;
    }

    public Veiculo buid(){
        return this.veiculo;
    }
}
