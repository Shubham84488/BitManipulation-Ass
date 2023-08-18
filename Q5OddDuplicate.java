public class Q5OddDuplicate{

    public static int findOddOccurringElement(int arr[]) {
        int result=0;
        for (int i : arr) {
            result = (result^i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        int result = findOddOccurringElement(arr);
        System.out.println("Odd occurring element: " + result);
    }
}