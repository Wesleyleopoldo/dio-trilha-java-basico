import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.err.println("O parâmetro 1 deve ser menor que o dois..." + e);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        for(int x = 1;x <= contagem; x ++){
            System.out.print(x + " ");
        }
    }
}
