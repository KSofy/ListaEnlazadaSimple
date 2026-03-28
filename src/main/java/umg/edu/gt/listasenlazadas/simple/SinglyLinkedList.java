package umg.edu.gt.listasenlazadas.simple;

/**
 * Implementacion basica de una lista simplemente enlazada.
 *
 * @param <T> tipo de dato almacenado
 */
public class SinglyLinkedList<T> {
    private SimpleNode<T> head;
    private SimpleNode<T> tail;
    private int size;

    public void addFirst(T value) {
        SimpleNode<T> newNode = new SimpleNode<>(value);
        newNode.setNext(head);
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(T value) {
        SimpleNode<T> newNode = new SimpleNode<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public boolean remove(T value) {
        if (head == null) {
            return false;
        }

        if (isSameValue(head.getValue(), value)) {
            removeFirst();
            return true;
        }

        SimpleNode<T> previous = head;
        SimpleNode<T> current = head.getNext();

        while (current != null) {
            if (isSameValue(current.getValue(), value)) {
                previous.setNext(current.getNext());
                if (current == tail) {
                    tail = previous;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    public boolean contains(T value) {
        SimpleNode<T> current = head;
        while (current != null) {
            if (isSameValue(current.getValue(), value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * RETO 1:
     * Cuenta cuantas veces aparece un valor dentro de la lista.
     *
     * Reglas sugeridas:
     * - No usar arreglos ni librerias externas.
     * - Resolver solo con recorrido de nodos.
     * - Complejidad esperada: O(n).
     *
     * @param value valor a buscar
     * @return cantidad de ocurrencias encontradas
     */
    
    public int countOccurrences(T value) {
        int count = 0;
        SimpleNode<T> current = head;

        // Recorrido de nodos lineal O(n)
        while (current != null) {
                        if (isSameValue(current.getValue(), value)) {
                count++;
            }
                        current = current.getNext();
        }

        return count;
    }        	

       
        /**
         * Reto 2 
         * Limpiar la lista
         */
    public void clean() {
    	tail = null;
    	head = null;
    	size = 0;

    }
       
        
        /**
         * RETO 3:
         * INVERTIR LA LISTA
         * 
         * Cambiar el orden de la lista, por ejemplo: 2->4->5-6
         * Lista invertido: 6->5->4->2
         */
        
        /**
         * RETO 4:
         * Eliminar duplicados
         */
        

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        SimpleNode<T> current = head;
        while (current != null) {
            builder.append(current.getValue());
            if (current.getNext() != null) {
                builder.append(", ");
            }
            current = current.getNext();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean isSameValue(T left, T right) {
        return left == right || (left != null && left.equals(right));
    }
}
