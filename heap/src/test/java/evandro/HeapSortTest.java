package evandro;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for BubbleSort.
 */
public class HeapSortTest  {
    private HeapSort heap = new HeapSort();
    /**
     * HeapSort odd numbers Test.
     */

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void oddSortTest() {
        int[] odd = new int[] {3, 7, 5, 11};
        int[] expectedArray = new int[] {3, 5, 7, 11};
        heap.sort(odd);
        assertArrayEquals(expectedArray, odd);
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void negativeSortTest() {
        int[] negative = new int[] {-3, 7, -5, 11};
        int[] expectedArray = new int[] {-5, -3, 7, 11};
        heap.sort(negative);
        assertArrayEquals(expectedArray, negative);
    }
}
