package complements;

import complements.InterfaceList;

public class ArrayList<G> implements InterfaceList<G>{

    private static class Node<T>{
        private final T data;
        private Node<T> previous;
        private Node<T> next;


        Node(T data){
            this.data = data;
        }
    }

    private Node<G> head;
    private Node<G> tail;
    private int size;

    public class Iterator implements IteratorGen<G>{

    }





}

/*

cosas de la pendeja maestra
1.-I will end the carrer
2.-I will not lost my class
3.-I will have a work in vacations
4.-I will do more workout
5.-I will repair the bicycle
 */