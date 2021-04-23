package complements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

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
}
