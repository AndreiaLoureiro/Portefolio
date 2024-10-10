
package excecao02;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Excecao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            String input = scanner.nextLine();
            
            // Tentativa de conversão
            int numero = Integer.parseInt(input);
            
            System.out.println("O número digitado é: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você não digitou um número válido.");
        }
    }
}
