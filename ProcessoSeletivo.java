import java.util.Random;
import  java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Cauan", "Wesley", "Júnior", "Jonatas", "Heberte", "Diogo", "T3ddy", "Richard", "Deni", "Gostlyn"};
        for(String candidato: candidatos){
            entrandoEmContato((candidato ));
        }

    }

    static void entrandoEmContato(String candidato){
        int tentandoContato = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentandoContato ++;
            }
            else{
                System.out.println("CONTATO REALIZADO!!!");
            }

        } while (continuarTentando && tentandoContato < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentandoContato + " TENTATIVA");
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO DE TENTATIVAS: " + tentandoContato);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Cauan", "Wesley", "Júnior", "Jonatas", "Heberte", "Diogo", "T3ddy", "Richard", "Deni", "Gostlyn"};

        for(int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato número: " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Cauan", "Wesley", "Júnior", "Jonatas", "Heberte", "Diogo", "T3ddy", "Richard", "Deni", "Gostlyn"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioEsperado = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou " + salarioEsperado);
            if(salarioBase > salarioEsperado){
                
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados ++;
            }
            
            candidatoAtual ++;
        }
    }
    static double  valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double valorPretendido){
        double salarioBase = 2000.0;

        if (valorPretendido < salarioBase){ 
            System.out.println("LIGAR PARA O CANDIDATO.");
        }

        else if(valorPretendido == salarioBase) System.out.println("LIGAR COM CONTRA PROPOSTA.");

        else System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");
    }
}