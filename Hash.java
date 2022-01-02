package Hash;

import List.LinkedList;

public class Hash{
    static Integer tamVector=10;
    LinkedList vector[];

    //construtor
    public Hash(){
        vector = new LinkedList[tamVector];
        initList();
    }

    //inicializando a lista
    public void initList(){
        for (int i=0; i<tamVector; i++){
            vector[i] = new LinkedList();
        }
    }

    //calcula o valor hash da chave 
    public int functionHash(String key){
        key = key.toLowerCase();
        int position = key.charAt(0);

        return position - 97;
    }

    //adiciona a chave na tabela hash
    public void addHash(String key){
        vector[functionHash(key)].add(key);
    }

    //remove chave da tabela hash
    public void removeHash(String key){
        vector[functionHash(key)].remove(key);
    }

    //busca chave na tabela hash
    public void searchHash(String key){
        vector[functionHash(key)].search(key);
    }

}