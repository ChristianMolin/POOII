package exe04;

import java.util.*;
public class Exercicio01 {
    Scanner leitor = new Scanner(System.in);
        
        private Set<Float> lista = new HashSet<>();
        private float num;
        private int confirm;
        
        public void rodarExe1(){
            do{
            System.out.println("Digite um numero: ");
            num = leitor.nextFloat();
            lista.add(num);
            System.out.println("Deseja adicionar mais um valor ? ");
            confirm = leitor.nextInt();
            
        }while(confirm != 0);
        
        Iterator<Float> it = lista.iterator();
        while(it.hasNext()){
            Float n = it.next();
            System.out.println(n);
        }
    }
}
