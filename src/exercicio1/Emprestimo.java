package exercicio1;

public class Emprestimo {

    public static void Calcular(double valor, int parcelas, double taxa){
        double total = valor* Math.pow(1+taxa, parcelas);
        System.out.println("O valor do final do empréstimo para " + parcelas + 
        " parcelas é: R$ " + total);        
    }
    
}
