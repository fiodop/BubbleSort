import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @org.junit.jupiter.api.Test
    void bubbleSort() {
        int[] arr = {1,5,3,2,6,0};
        int [] sortedByMyAlg = BubbleSort.bubbleSort(arr);
        int [] sortedArray = new int[]{0,1,2,3,5,6};
        assertArrayEquals(sortedArray, sortedByMyAlg);
    }

    @org.junit.jupiter.api.Test
    void bubbleSort1() {
        int[] arr = {};
        int [] sortedByMyAlg = BubbleSort.bubbleSort(arr);
        int [] sortedArray = new int[]{0,1,2,3,5,6};
        assertArrayEquals(sortedArray, sortedByMyAlg);
    }
}