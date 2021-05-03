import complements.ArrayList;
import complements.InterfaceList;
import complements.IteratorGen;

public class Main {
    public static void main(String[] args) {

        InterfaceList<Integer> lista1 = new ArrayList<>();
        InterfaceList<String> lista2 = new ArrayList<>();

        lista1.add(7);
        lista1.add(4);
        lista1.add(14);
        lista1.add(3);

        lista2.add("Hola");
        lista2.add("Object");
        lista2.add("Oriented");
        lista2.add("Programing");


        System.out.println("--------------------------------");

        System.out.println("*****Normal Iterator*****");

        System.out.println("*****List 1*****");
        System.out.println("El tamaño es: " + lista1.getSize());

        IteratorGen<Integer> it = lista1.getIterator();

        while (it.hasNext()) {
            int element = it.next();
            System.out.println("Dato: " + element);
        }

        System.out.println("*****List 2*****");
        System.out.println("El tamaño es: " + lista2.getSize());

        IteratorGen<String> it2 = lista2.getIterator();

        while (it2.hasNext()) {
            String element = it2.next();
            System.out.println("Dato: " + element);
        }

        System.out.println("--------------------------------");

        System.out.println("*****Reverse Iterator*****");

        System.out.println("*****List 1*****");
        System.out.println("El tamaño es: " + lista1.getSize());

        IteratorGen<Integer> it3 = lista1.getReverseIterator();

        while (it3.hasNext()) {
            int element = it3.next();
            System.out.println("Dato: " + element);
        }

        System.out.println("*****List 2*****");
        System.out.println("El tamaño es: " + lista2.getSize());

        IteratorGen<String> it4 = lista2.getReverseIterator();

        while (it4.hasNext()) {
            String element = it4.next();
            System.out.println("Dato: " + element);
        }

    }
}