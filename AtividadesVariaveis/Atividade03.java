package AtividadesVariaveis;

import java.text.DecimalFormat;

public class Atividade03 {


    public static void main(String[] args) {

        String nomeDoProduto = "Celular retrátil";
        double valorUnitarioProduto = 7500.00;
        int quantidadeProdutosComprados = 50;
        double taxaDeImposto = 0.25;
        double margemDeLucro = 0.20;

        String padrao = "R$ ###,##0.00";
        DecimalFormat df = new DecimalFormat(padrao);

        double valorTotalSemImpostos = (valorUnitarioProduto * quantidadeProdutosComprados);
        double valorTotalComImpostos = valorTotalSemImpostos + (valorTotalSemImpostos * taxaDeImposto);
        double precoDeVendaNecessario = valorTotalComImpostos + (valorTotalSemImpostos * margemDeLucro);


        System.out.println("Nome do Produto: " + nomeDoProduto);
        System.out.println("Valor Unitário: " + df.format(valorUnitarioProduto));
        System.out.println("Valor com imposto: " + df.format(valorTotalComImpostos));
        System.out.println("Quantidade comprada: " + quantidadeProdutosComprados);
        System.out.println("Taxa de Imposto: " + taxaDeImposto);
        System.out.println("Margem de Lucro: " + margemDeLucro);
        System.out.println("O produto " + nomeDoProduto + " possui um valor de " + df.format(valorTotalComImpostos) + " com impostos, seu preço de venda sugerido seria de " + df.format(precoDeVendaNecessario));






    }
}
