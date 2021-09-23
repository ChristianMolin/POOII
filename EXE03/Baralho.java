package exe03;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
    private List<Cartas> baralho = new ArrayList<>();
    private int tam = 52;
    
    public Baralho(){
        for (int i = 1 ; i < 14 ; i ++){
            for(int j = 1 ; j <= 4 ; j++){
                baralho.add(new Cartas(i, j));
            }
        }
    }
    
    public void pegaCarta(int v, int n) throws Exception{
        
        if(v > 0 && v < 14){
            if(n > 0 && n <=4){
                for (int i = 0 ; i < tam ; i ++){
                    if(baralho.get(i).getValor() == v && baralho.get(i).getNaipe() == n){
                        printaCarta(i);
                        baralho.remove(i);
                        tam--;
                    }
                }
            }else{
                throw new Exception("Naipe não encontrado");
            }
        }else{
            throw new Exception("Carta não encontrada");
        }
    }
    
    public void printaCarta(int num){
        
        int valor = baralho.get(num).getValor();
        int naipe = baralho.get(num).getNaipe();
        
        String naipeStr = "nada";
        
        switch(naipe){
            case 1:
                naipeStr = "Paus";
                break;
            case 2:
                naipeStr = "Copas";
                break;
            case 3:
                naipeStr = "Espada";
                break;
            case 4:
                naipeStr = "Ouro";
                break; 
        }
            System.out.println("--------------\nCarta: " + valor + "\nNaipe: " +naipeStr + "\n--------------");
    }
            
    public List<Cartas> getBaralho() {
        
        return baralho;
    }
}
