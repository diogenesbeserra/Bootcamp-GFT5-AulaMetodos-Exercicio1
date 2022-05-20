package exercicio1;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Exercício 1 da aula entendendo métodos em java");
        System.out.println("Calculadora");

        Calculadora.Soma(2, 3);
        Calculadora.Subtracao(5, 3);
        Calculadora.Multiplicacao(4, 5);
        Calculadora.Divisao(10, 2);

        Saudacao.GetSaudacao(2);
        Saudacao.GetSaudacao(8);
        Saudacao.GetSaudacao(13);        
        Saudacao.GetSaudacao(23);

        Emprestimo.Calcular(1000, 4, 0.035);
                
    }
}
