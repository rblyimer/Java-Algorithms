import java.util.Arrays;
public class QuickSort {
    public static int partition (int[] array, int small, int large) {
        int pivot = array[large];
        int i = (small - 1);
        for (int j = small; j <= large - 1; j++) {
            if (array[j] <= pivot) {i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[large];
        array[large] = temp;
        return (i + 1);
    }

    public static void quickSort(int[] array, int small, int large) {
        if (small < large) {
            int part = partition(array, small, large);
            quickSort(array, small, part - 1);
            quickSort(array, part + 1, large);
        }
    }
	public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}