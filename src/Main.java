
import complements.InterfaceList;
import complements.IteratorGen;
import complements.LinkedListG;
//import complements.Position;

public class Main{
    public static void main(String []args) {
        InterfaceList<Integer> lista1 = new LinkedListG<>();
        InterfaceList<String> lista2 = new LinkedListG<>();
        InterfaceList<Float> lista3 = new LinkedListG<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(7);

        lista2.add("Hola");
        lista2.add("Object");
        lista2.add("Oriented");
        lista2.add("Programing");

        lista3.add(3.25F);
        lista3.add(2.90F);
        lista3.add(45.10F);
        lista3.add(90.29F);

        /*while (it.hasNext()) {
            LinkedListG<Integer>.Iterator backupIt = lista1.new IteratorGen(it);
            int element = it.next(); //regresa el dato y avanza al iterador
            if (element == 3) {
                lista1.insert(10, Position.BEFORE, backupIt);
            }
            if (element == 7) {
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }*/

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

        System.out.println("----------------------------");

        IteratorGen<Float> it3 = lista3.getIterator();
        System.out.println("El tamaño es: " + lista3.getSize());
        while (it3.hasNext()) {
            System.out.println("Dato:" + it3.next());
        }

        System.out.println("----------------------------");

       it3 = lista3.getReverseIterator();

        while (it3.hasNext()) {
            Float date = it3.next();

            System.out.println("Dato: " + date);
        }

    }
}