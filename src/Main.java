import complements.ArrayList;
import complements.InterfaceList;
import complements.IteratorGen;

public class Main{
    public static void main(String []args) {

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

        System.out.println("El tamaño es: " + lista1.getSize());

        IteratorGen<Integer> it = lista1.getIterator();

        while (it.hasNext()) {
            int element = it.next();
            System.out.println("Dato: " + element);
        }

        lista1.delete(3);

        System.out.println("-----------------------------");

        it = lista1.getReverseIterator();

        while (it.hasNext()) {
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("----------------------------");

        IteratorGen<String> it2 = lista2.getIterator();
        System.out.println("El tamaño es: " + lista2.getSize());
        while (it2.hasNext()) {
            System.out.println("Dato:" + it2.next());
        }

        System.out.println("----------------------------");

        it2 = lista2.getReverseIterator();

        while (it.hasNext()) {
            String name = it2.next();

            System.out.println("Dato: " + name);
        }
    }
}