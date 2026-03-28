package umg.edu.gt.listasenlazadas.applications;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Caso real: backlog simple de tareas con consumo por orden de llegada.
 */
public final class TaskBacklogApp {

    private TaskBacklogApp() {
    }

    public static void run() {
        SinglyLinkedList<String> backlog = new SinglyLinkedList<>();
        backlog.addLast("Configurar entorno del proyecto");
        backlog.addLast("Implementar login");
        backlog.addLast("Agregar validaciones");
        backlog.addLast("Implementar login");

        System.out.println("1) TaskBacklogApp");
        System.out.println("Backlog inicial: " + backlog);
        System.out.println("Atendiendo: " + backlog.removeFirst());
        System.out.println("Backlog restante: " + backlog);
        System.out.println("El valor aparece: " + backlog.countOccurrences("Implementar login"));
    }
}
