package List;

public class LinkedList <T extends Comparable<? super T>> {
    
    private Node<T> first; 
    private Node<T> last;

    public LinkedList(){
        first = null;
        last = null;
    }

    //adicionando na lista
    public void add (T key){
        if (first == null){
            first = new Node<T>();
            last = first;
            Node<T> newList = new Node<T>();
            newList.setKey(key);
            newList.setNext(null);
            last.setNext(newList);
            last = newList;

        }else{
            Node<T> newList = new Node<T>();
            newList.setKey(key);
            newList.setNext(null);
            last.setNext(newList);
            last = newList;
        }
    }

    //removendo da lista
    public void remove (T key){
        Node<T> data = first.getNext();
        Node<T> aux = first;

        if (first != null){
            while (data != null){
                if (data.getKey().equals(key)){
                    if (data.getNext() == null){
                        last = aux;
                        last.setNext(null);
                        data = null;
                        break;
                    }else{
                        aux.setNext(data);
                        data.setNext(null);
                        data = null;
                        break;
                    }
                }
                data = data.getNext();
                aux = aux.getNext();
            }
        }
    }

    //buscando a chave na lista
    public void search(T key){
        Node<T> data = first.getNext();
        boolean find = false;

        while(data != null){
            if (data.getKey().equals(key)){
                System.out.println("\nPalavra: "+ data.getKey());
                find = true;
                break;
            }
            data = data.getNext();
        }
        if (find != true){
            System.out.println("\nPalavra nao encontrada");
        }

    }

    //imprime a lista
    public void printList (){
        Node<T> data = first.getNext();

        while (data != null){
            System.out.println("\nPalavra: "+ data.getKey());
            data = data.getNext();
        }
    }

}
