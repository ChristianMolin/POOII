package exe03;

import java.util.Scanner;

public class EXE03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int carta;
        Baralho baralho = new Baralho();
        
        do{
            System.out.print("\n0 - Fechar programa\n1 - Às\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11 - J\n12 - Q"
                    + "\n13 - K\nDigite qual carta deseja:  \n");
            carta = leitor.nextInt();
            if(carta == 0){
                System.out.println("Até mais.");
                System.exit(0);
            }
            System.out.print("\n1 - Paus\n2 - Copas"
                    + "\n3 - Espada\n4 - Ouro\nEscolha o naipe da carta: \n");
            int naipe = leitor.nextInt();

            try{
                baralho.pegaCarta(carta, naipe);
            }catch (Exception e){
                System.out.println("\nErro: " +e.getMessage());
            }
        }while(carta > 0);
    }
    
}
