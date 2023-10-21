public class BinarySearch {

    public static int doBinarySearch(int[] array, int item){
        int low = 0;
        int high = array.length - 1 ;
        while (low <= high){
            int mid = (low + high ) / 2;


            if (array[mid] == item)
                return mid;

            if (item > array[mid]){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1,3,4,6,7,8};
        System.out.println(doBinarySearch(array, 1));
    }
}
