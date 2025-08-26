package AtividadesVariaveis;

public class Atividade02 {

    public static void main(String[] args) {

        String nome = "João";
        int idade = 23;
        double salario = 1200.00;
        int mesesTrabalhadosAoAno = 11;
        int produtosComprados = 5;

        double salarioAnualBruto = (salario * mesesTrabalhadosAoAno);
        double salarioAnualLiquido = (salarioAnualBruto) - 2000.00;

        double mediaDoValorGasto = produtosComprados / 1500.00;

        System.out.println(nome + " seu salário este ano será " + salarioAnualLiquido +  " , com desconto aplicado de 2000.00 do vale transporte.");
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Meses Trabalhados: " + mesesTrabalhadosAoAno);
        System.out.println("ProdutosComprados: " + produtosComprados);
        System.out.println("SalarioAnualBruto: " + salarioAnualBruto);
        System.out.println("SalarioAnualLiquido: " + salarioAnualLiquido);
        System.out.println("Media dos valores do produto: " + mediaDoValorGasto);




    }
}
