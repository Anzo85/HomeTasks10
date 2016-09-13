package Arrays;

public class ArraySumDefine {

    int[] array;


    public ArraySumDefine(int[] array) {
        this.array = array;

    }

    public boolean isSum(int sum) {

        boolean result = false;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            if (array[low] + array[high] == sum) {
                result = true;
                break;
            }
            if (array[low] + array[high] > sum) {
                high--;
            }
            if (array[low] + array[high] < sum) {
                low++;
            }


        }

        return result;
    }
}
