import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReverseInPlaceInput() {
    int[] numArr1 = {3, 4, 5, 6, 7};
    ArrayExamples.reverseInPlace(numArr1);
    System.out.println(Arrays.toString(numArr1));
    assertArrayEquals(new int[]{7, 6, 5, 4, 3}, numArr1);


    // error: expected [7, 6, 5, 4, 3], actual [7, 6, 5, 6, 7]
  }

  @Test
  public void testReversedInput() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reversed(input1);
    System.out.println(Arrays.toString(input1));
    assertArrayEquals(new int[]{5, 4, 3, 2, 1 }, input1);


    // error: expected [5, 4, 3, 2, 1], actual: [0, 0, 0, 0, 0]
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.averageWithoutLowest(input1);
    System.out.println(Arrays.toString(input1));
    assertEquals(3, input1);


    // error: expected [5, 4, 3, 2, 1], actual: [0, 0, 0, 0, 0]
  }

}
