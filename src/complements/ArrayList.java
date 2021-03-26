package complements;

public class ArrayList<G> implements InterfaceList<G>{

    


   private Object array[];
   private int size;

   public ArrayList(){
       this.array = new Object[2];
   }

   @Override
    public void add(G data){
    this.array = new Object[size];
    size++;
   }

   @Override
    public G get(int index){
       return (G)this.array[index];
   }

   @Override
    public void delete(int index){
       Object aux;
       if( index <0 && index >= size)
           return;
       if(index == 0)

       int currentindex;
       if( size == 0)
           System.out.println("El array esta vacio... ");
       for(currentindex=0;currentindex < size ; currentindex++){
           int currentplus = currentindex+1;
           if( (int)this.array[currentindex] == index ) {
               aux = this.array[currentindex];
               this.array[currentplus] = this.array[currentindex];
               if( this.array[currentplus] == null ){
                   currentindex++;
                   this.array[currentplus] = this.array[currentindex];
               }

           }
       }
       size--;
   }

    @Override
    public int getSize(){
       return size;
    }

    public class Iterator implements IteratorGen<G>{
       private Object currentArray;

       public Iterator(){
           this.currentArray = 0;//head
       }

       public Iterator(Iterator iterator){
           currentArray = iterator.currentArray;
       }

       public boolean hasNext(){
           return currentArray != null;
       }

       public G next(){
           G data = this.currentArray;

       }

       Object getCurrentArray(){
           return currentArray;
       }
    }


    @Override
    public IteratorGen<G> getIterator(){
       return new IteratorGen<G>() {
           @Override
           public boolean hasNext() {
               return false;
           }

           @Override
           public G next() {
               return null;
           }
       };
    }

    @Override
    public void insert(G data,Position position,IteratorGen<G> it){

    }

    @Override
    public IteratorGen<G> getReverseIterator(){
       return null;
    }
}