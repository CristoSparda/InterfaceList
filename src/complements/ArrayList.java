package complements;

public class ArrayList<G> implements InterfaceList<G>{
    private Object[] array;
    private int size;

    public ArrayList(){
        this.array = new Object[2];
    }

    @Override
    public void add(G data){
        if( this.array.length == size) {
            Object[] anterior = this.array;
            this.array = new Object[this.array.length * 2];
            for(int j = 0 ; j < size ; j++){
                this.array[j] = anterior[j];
            }
        }
        this.array[size] = data;
        size++;
    }

    @Override
    public G get(int index){
        return (G)this.array[index];
    }

    @Override
    public void delete(int index){
        if( index <0 && index >= size)
            return;
        int currentindex;
        for( currentindex=index+1 ; currentindex < size ; currentindex++){
            this.array[currentindex-1] = this.array[currentindex];
        }
        size--;
    }

    @Override
    public int getSize(){
        return size;
    }


    public class FordwardIterator implements IteratorGen<G>{
        private int currentIndex;

        public FordwardIterator(){
            this.currentIndex = 0;//head
        }

        public FordwardIterator(FordwardIterator iterator)  {
            currentIndex = iterator.currentIndex;
        }

        public boolean hasNext(){
            return currentIndex < size ;
        }

        public G next(){
            return (G)array[currentIndex++];
        }

        Object getCurrentIndex(){
            return currentIndex;
        }
    }


    @Override
    public IteratorGen<G> getIterator(){
        return new FordwardIterator();

    }

    @Override
    public void insert(G data,Position position,IteratorGen<G> it){

    }


    public class FordwardReverseIterator implements IteratorGen<G>{
        private int currentIndex;

        public FordwardReverseIterator(){
            this.currentIndex = size-1;//head
        }

        public FordwardReverseIterator(FordwardReverseIterator iterator)  {
            currentIndex = iterator.currentIndex;
        }

        public boolean hasNext(){
            return currentIndex >= 0;
        }

        public G next(){
            return (G)array[currentIndex--];
        }

        Object getCurrentIndex(){
            return currentIndex;
        }
    }

    public IteratorGen<G> getReverseIterator(){
        return new FordwardReverseIterator();
    }

}
