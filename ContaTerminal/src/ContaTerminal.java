/**
* <h1>Conta-Banco</h1>
* Projeto do Banco no Terminal, que lê o nome, Número da Agência, Número da conta, e logo após isso
* Exibe tudo no Terminal
*
* <p>
* <b>Note:</b> Leia atentamente a documentção desta classe para
* desfrutar dos recursos oferecidos pelo autor
* 
* @author Wesley Leopoldo
* @version 1.0
* @since 17/05/2024
 */

 
/**
 * Importei as classes java.util.Locale e a java.util.Scanner
 * 
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    /**
     * 
     * @param args Este é o unico parâmetro do método
     * @throws Exception Este é para exceções
     */

    public static void main(String[] args) throws Exception {
        // Criando um novo scanner...
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Homepage e entrada dos dados do Banco...
        System.out.println("Hello! Welcome my bank!!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter Branch number: ");
        String branchNumber = scanner.next();
        System.out.print("Please enter Account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Please enter your First deposit: $");
        float firstDeposit = scanner.nextFloat();
        
        // Saida dos dados...
        System.out.println("Hey " + name + " Welcome!!! It's a pleasure meeting you. Your account to be created. The Branch number is: " + branchNumber + " and Account number is: " + accountNumber);
        System.out.println("You balance in account is: $" + firstDeposit);
    }
}
