import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinMax {
    public int[] findMinMax(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        int[] minMax=new int[2];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        minMax[0]=min;
        minMax[1]=max;
        return minMax;

    }

    @Test
    @DisplayName("To find minimum and maximum of given array")
    void testMinMax() {
        MinMax minmax=new MinMax();
        assertArrayEquals(new int[] {3,58},minmax.findMinMax(new int[] {58,34,7,3,54,3,34,34,53}));
        assertArrayEquals(new int[] {0,35},minmax.findMinMax(new int[] {16,5,35,30,28,17,0,7,19}));
        assertArrayEquals(new int[] {110,201},minmax.findMinMax(new int[] {110,120,175,201,117}));
        assertArrayEquals(new int[] {1001,2500},minmax.findMinMax(new int[] {1001,1500,2500,2100,1300}));
    }
}
