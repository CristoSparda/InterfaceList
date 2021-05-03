package complements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest extends Exceptions{

    //Given_When_Then
    @Test
    public void WhenListCreated_ThenListIsEmpty(){
        //Given:
        //When:
        ArrayList<Integer> lista = new ArrayList<>();
        //Then:
        //Assert
        assertEquals( 0 , lista.getSize() );
    }

    @Test
    public void WhenListObjectisAdded(){
        //Given:
        //When:
        ArrayList<Integer> list = new ArrayList<>();
        //Then:
        list.add(20);
        list.add(800);
        list.add(4);
        //Assert
        assertEquals( 3 , list.getSize() );
        assertEquals( 20, list.get(0) );
        assertEquals( 800, list.get(1) );
        assertEquals( 4, list.get(2) );
    }

    @Test
    public void WhenObjectisDeleted(){
        //When:
        ArrayList<Integer> list = new ArrayList<>();
        //Then:
        list.add(20);
        list.add(800);
        list.add(4);
        list.add(89);
        list.add(6);
        //Assert
        assertEquals( 5 , list.getSize() );
        assertEquals( 20, list.get(0) );
        assertEquals( 800, list.get(1) );
        assertEquals( 4, list.get(2) );
        assertEquals( 89, list.get(3) );
        assertEquals( 6, list.get(4) );

        list.delete(3);
        //Assert
        assertEquals( 4 , list.getSize() );
        assertEquals( 20, list.get(0) );
        assertEquals( 800, list.get(1) );
        assertEquals( 4, list.get(2) );
        assertEquals( 6, list.get(3) );
    }

    @Test
    public void FordwardTested_WhenObjectisAdded(){
        //When:
        ArrayList<Integer> list = new ArrayList<>();
        //Then:
        list.add(20);
        list.add(800);
        list.add(4);
        //Assert
        assertEquals( 3 , list.getSize() );

        IteratorGen<Integer> it = list.getIterator();

        assertTrue( it.hasNext());
        assertEquals( 20 , it.next() );
        assertTrue( it.hasNext());
        assertEquals( 800 , it.next() );
        assertTrue( it.hasNext());
        assertEquals( 4 , it.next() );
        assertFalse( it.hasNext());
    }

    @Test
    public void FordwardTested_WhenObjectisDeleted(){
        //When:
        ArrayList<Integer> list = new ArrayList<>();
        //Then:
        list.add(20);
        list.add(800);
        list.add(4);
        //Assert
        assertEquals( 3 , list.getSize() );

        IteratorGen<Integer> it = list.getIterator();

        assertTrue( it.hasNext());
        assertEquals( 20 , it.next());
        assertTrue( it.hasNext());
        assertEquals( 800 , it.next() );
        assertTrue( it.hasNext());
        assertEquals( 4 , it.next() );
        assertFalse(it.hasNext());

        list.delete( 1 );

        IteratorGen<Integer> iterator = list.getIterator();

        assertTrue( iterator.hasNext());
        assertEquals( 2, list.getSize());
        assertEquals( 20 , list.get(0) );
        assertTrue( iterator.hasNext());
        assertEquals( 4 , list.get(1) );
        assertTrue( iterator.hasNext());
        assertFalse(it.hasNext());
    }

   @Test
   public void ReverseIterator_WhenObjectisAdded() {
       //When:
       ArrayList<Integer> list = new ArrayList<>();
       //Then:
       list.add(20);
       list.add(800);
       list.add(98);
       list.add(45);
       list.add(4);
       //Assert
       assertEquals(5, list.getSize());

       IteratorGen<Integer> it = list.getReverseIterator();

       assertTrue(it.hasNext());
       assertEquals(4, it.next());
       assertTrue(it.hasNext());
       assertEquals(45, it.next());
       assertTrue(it.hasNext());
       assertEquals(98, it.next());
       assertTrue(it.hasNext());
       assertEquals(800, it.next());
       assertTrue(it.hasNext());
       assertEquals(20, it.next());
       assertFalse(it.hasNext());
   }

}















