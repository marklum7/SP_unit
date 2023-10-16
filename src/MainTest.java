import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testComdsort1() {
        int[] arr1 = {1, 2, 3, 4, 5};
        Main.comdsort(arr1);
        int[] expectedArr1 = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr1, arr1);
    }
    @Test
    public void testComdsort2() {
        int[] arr2 = {5, 4, 3, 2, 1};
        Main.comdsort(arr2);
        int[] expectedArr2 = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr2, arr2);
    }
    @Test
    public void testComdsort3() {
        int[] arr3 = {3, 1, 4, 2, 5};
        Main.comdsort(arr3);
        int[] expectedArr3 = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr3, arr3);
    }
    @Test
    public void testComdsort4() {
        int[] arr4 = {3, 1, 2, 4, 2};
        Main.comdsort(arr4);
        int[] expectedArr4 = {1, 2, 2, 3, 4};
        assertArrayEquals(expectedArr4, arr4);
    }
    @Test
    public void testSwap() {
        int[] values = {4, 7, 2, 9, 1};
        int[] expected = {4, 2, 7, 9, 1};

        Main.swap(values, 1, 2);

        assertArrayEquals(expected, values);
    }
}