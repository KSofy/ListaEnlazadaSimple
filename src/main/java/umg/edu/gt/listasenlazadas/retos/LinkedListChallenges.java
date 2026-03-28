package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        System.out.println();
        challenge2Clean(); 
        System.out.println();
        challenge3Invert();
        System.out.println();
        challenge4RemoveDuplicates();
        System.out.println();


    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");
        
        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        int totalLogins = eventos.countOccurrences("LOGIN");
        System.out.println("Resultado esperado para LOGIN: 3");
        System.out.println("Resultado obtenido: " + totalLogins);

        
    }

    private static void challenge2Clean() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("A");
        eventos.addLast("B");
        eventos.addLast("C");

        System.out.println("Reto 2 - Limpiar lista");
        System.out.println("Antes: " + eventos + " size: " + eventos.size());

        try {
            int eliminados = eventos.clean();
            System.out.println("Nodos eliminados: " + eliminados);
            System.out.println("Después: " + eventos + " size: " + eventos.size());
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
    private static void challenge3Invert() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);

        System.out.println("Reto 3 - Invertir lista");
        System.out.println("Original: " + numeros);
        numeros.invert();
        System.out.println("Invertida: " + numeros);
    }

    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(4);
        numeros.addLast(6);
        numeros.addLast(2);

        System.out.println("Reto 4 - Eliminar duplicados");
        System.out.println("Original: " + numeros);
        numeros.removeDuplicates();
        System.out.println("Sin duplicados: " + numeros);
    }

    
}