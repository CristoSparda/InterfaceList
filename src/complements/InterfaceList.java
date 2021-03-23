package complements;

public interface InterfaceList<G> {
    //firmas
    void add(G data);

    void delete(int index);

    int getSize();

    G get(int index);

    IteratorGen<G> getIterator();

    void insert(G data,Position position,IteratorGen<G> it);

    IteratorGen<G> getReverseIterator();

}
