package exe04;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Exercicio02 {
    Scanner leitor = new Scanner(System.in);
    
    private Map<String, String> pessoasTelefones = new HashMap<>();
    private String nome;
    private String telefone;
    private int confirm;
    
     public void rodarExe2(){
        do{
            System.out.println("Digite o nome: ");
            nome = leitor.nextLine();
            System.out.println("Digite o telefone: ");
            telefone = leitor.nextLine();
            pessoasTelefones.put(nome, telefone);
            System.out.println("Deseja adicionar outra pessoa ? ");
            confirm = leitor.nextInt();
            
        }while(confirm != 0);
        
        System.out.println("Deseja pesquisar uma pessoa ? ");
        confirm = leitor.nextInt();
        
        if(confirm == 1){
            System.out.println("Deseja pesquisar por:\n1 - nome\n2 - telefone");
            confirm = leitor.nextInt();
            if(confirm == 1){
                System.out.println("Digite o nome da pessoa: ");
                nome = leitor.next();
                caso1();
            }else if(confirm == 2){
                System.out.println("Digite o telefone da pessoa: ");
                telefone = leitor.next();
                caso2();
                    
            }
        }
        
    }
     public void caso1(){
         if(pessoasTelefones.containsKey(nome)){
            System.out.println("O numero de " + nome +" é: " + pessoasTelefones.get(nome));
         }else{
            System.out.println("Nome invalido");
         }
     }
     public void caso2(){
         if(pessoasTelefones.containsValue(telefone)){
            System.out.println(pegarChave(pessoasTelefones, telefone));
         }
     }
     public static <T, E> Set<T> pegarChave(Map<T, E> map, E value) {
    Set<T> keys = new HashSet<T>();
    for (Entry<T, E> entry : map.entrySet()) {
        if (Objects.equals(value, entry.getValue())) {
            keys.add(entry.getKey());
        }
    }
    return keys;
}
     
}
