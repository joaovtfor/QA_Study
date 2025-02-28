import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
public class ThirdExercise{
    
    @Test
    public void teste() {
         List<Integer> s = new ArrayList<Integer>();
         //System.out.println(s.isEmpty());
         assertTrue(s.isEmpty());
        // teste 2
         s = new ArrayList<Integer>();
         s.add(1);
         //System.out.println(s.isEmpty());
         assertTrue(s.isEmpty());
        // teste 3
         s = new ArrayList<Integer>();
         s.add(1);
         s.add(2);
         s.add(3);
         //System.out.println(s.size());
         //System.out.println(s.get(0));
         //System.out.println(s.get(1));
         //System.out.println(s.get(2));
        // assertEquals(3, s.size());
        // assertEquals(1, s.get(0));
        // assertEquals(2, s.get(1));
        // assertEquals(3, s.get(2));
         
        // teste 4
         s = new ArrayList<Integer>();
         s.add(1);
         s.add(2);
         s.add(3);
         int elem = s.remove(2);
         //System.out.println(elem);
         //System.out.println(s.get(0));
         //System.out.println(s.get(1));
         assertEquals(2, elem);
        // assertEquals(1, s.get(0));
        // assertEquals(3, s.get(1));
        // teste 5
         s = new ArrayList<Integer>();
         s.add(1);
         s.remove(0);
         //System.out.println(s.size());
         //System.out.println(s.isEmpty());
         assertEquals(0, s.size());
         assertTrue(s.isEmpty());
        // teste 6
       // @Test(expected = java.util.IndexOutOfBoundsException.class)
         try {
             s = new ArrayList<Integer>();
             s.add(1);
             s.add(2);
             s.remove(2);
         } catch (IndexOutOfBoundsException e) {
             System.out.println("IndexOutOfBound");
         }
         
    }
}