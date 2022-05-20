package exercicio1;

public class Saudacao {
    public static void GetSaudacao(int hora){
        if (hora < 12 && hora >= 5){
            System.out.println("Bom Dia!");
        }else if(hora >= 18 || hora < 5){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Boa Tarde!");
        }
    }
}
