
public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        if (a == null || a.length == 0){
            System.out.println("array is null");
            return a;
        }
        if (a.length == 1){
            System.out.println(a[0]);
            return a;
        }
        int tmp = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }
}
