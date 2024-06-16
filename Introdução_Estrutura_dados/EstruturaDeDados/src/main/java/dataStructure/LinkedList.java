package dataStructure;

/**
 * Ada Tech - Santander Coders 2024 *

 * Implementação de uma LinkedList.
 * Lista encadeada simples.
 * Cada nó da lista armazena um dado do tipo String.
 */
public class LinkedList {

    private Node head;

    private Node tail;

    private int length;

    /**
     * Nó na lista encadeada.
     */
    class Node {
        String data;
        Node next;

        /**
         * É fornecido um dado e um novo nó é construído.
         * @param data O dado que vai ser armazenado no nó.
         */
        Node(String data) {
            this.data = data;
        }
    }

    /**
     * Construção da lista nova encadeada, tendo um único nó com o dado fornecido.
     * @param data O dado que é armazenado no primeiro nó.
     */
    public LinkedList(String data) {
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    /**
     * Imprime o dado armazenado na cabeça da lista,
     * Se não houver dado na lista, imprime que ela esta vazia.
     */
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.data);
        }
    }

    /**
     * Imprime o dado armazenado na cauda da lista.
     * Se ela for vazia, imprime a informação.
     */
    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Tail: " + tail.data);
        }

    }

    /**
     * Printa o tamanho da lista.
     */
    public void getLength() {
        System.out.println("Lenght: " + this.length);
    }

    /**
     * Remove os nós e deixa a lista vazia.
     */
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * Imprime todos os elementos da lista.
     */
    public void print() {
        System.out.println("############################");
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("############################");
    }

    /**
     * Adiciona o dado fornecido no final da lista.
     * @param data Armazena em um novo nó o dado.
     */
    public void append(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * Remove o último nó e retorna ele.
     * @return o nó removido ou nulo se a lista estiver vazia.
     */
    public Node removeLast() {
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while(pre.next != tail) {
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    /**
     * Com o dado fornecido, adiciona um novo nó no início da lista.
     * @param data é o dado que será adicionado no novo nó.
     */
    public void prepend(String data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /**
     * O primeiro nó da lista é removido e retornado.
     * @return o primeiro nó ou nulo se a lista está vazia.
     */
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     * Retorna o nó na posição especificada nesta lista.
     * @param index índice do nó a ser retornado.
     * @return o nó na posição especificada nesta lista ou null se o índice estiver fora do intervalo.
     */
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Substitui o elemento na posição especificada nesta lista pelo elemento especificado.
     * @param index índice do elemento a ser substituído.
     * @param data a ser armazenado na posição especificada.
     * @return true se a operação foi bem-sucedida, caso contrário, false.
     */
    public boolean set(int index, String data) {
        Node temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    /**
     * Insere o elemento especificado na posição especificada nesta lista.
     * @param index índice no qual o elemento especificado será inserido.
     * @param data o dado a ser inserido.
     * @return true se a operação foi bem-sucedida, caso contrário, false.
     */
    public boolean insert(int index, String data) {
        if (index <0 || index > length) return false;
        if (index == 0) {
            prepend(data);
            return true;
        }
        if (index == length) {
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    /**
     * Remove o elemento na posição especificada nesta lista.
     * @param index o índice do elemento a ser removido.
     * @return o nó que foi removido da lista ou null se o índice estiver fora do intervalo.
     */
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    /**
     * Método principal, que testa a lista encadeada a ser implementada.
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prepend("Elemento 0");

        list.remove(2);
        list.print();


//          list.insert(3, "Elemento 2.5");

//          System.out.println(list.get(2).data);

//          System.out.println(list.removeFirst().data);
//          list.set(1, "Elemento 0.5");
//          list.print();
//          list.getHead();
//          list.getTail();
//          list.getLength();
//          list.print();
    }

}
