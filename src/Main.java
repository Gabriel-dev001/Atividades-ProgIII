import AtividadeI.Pizza;
import AtividadeI.PizzaBuilder;
import AtividadeII.VeiculoBuilder;
import AtividadeII.Veiculo;
import AtividadeIII.Relatorio;
import AtividadeIII.RelatorioBuilder;

public class Main{
    public static void main(String[] args){
        System.out.println("Exercicio 01\n__________");
        Pizza pizza = ExI();
        System.out.println(pizza + "\n");

        System.out.println("Exercicio 02\n__________");
        ExII();

        System.out.println("Exercicio 03\n__________");
        ExIII();
    }

    private static Pizza ExI(){
        return new PizzaBuilder()
                .setMassa("Normal")
                .setTamanho("GG")
                .setIngrediente("Strogonoff de Carne")
                .buid();
    }

    private static void ExII(){
        Veiculo caro = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Vermelho")
                .setRodas(4)
                .buid();

        Veiculo moto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Azul")
                .setRodas(2)
                .buid();

        System.out.println(caro + "\n__________");
        System.out.println(moto + "\n");
    }

    private static void ExIII(){
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("'Titulo'")
                .setCorpo("'Corpo'")
                .setRodape("'Rodape'")
                .buid();

        System.out.println(relatorio + "\n");
    }
}