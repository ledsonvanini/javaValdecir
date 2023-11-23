 
/**
 * //TODO
 * Programa para calcular a Média.
 * Declarar 4 notas. Se a media for maior que 6; 
 * então mostrar a mensagem "Aprovado". Senão mostrar "Reprovado"
 */

public class CalcularMedia {
    public static void main(String[] args) {
        double nota1 = 3.9;
        double nota2 = 3.5;
        double nota3 = 8.7;
        double nota4 = 6.5;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media > 6) {
            System.out.println("----------------------------------------");
            System.out.println("Sua média foi: " + media + "\nStatus: Aprovado");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Sua média foi: " + media + "\nStatus: Reprovado");
            System.out.println("----------------------------------------");
        }
    }
}