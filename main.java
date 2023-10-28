public class PairSumCounter {
    public static int countPairsWithSum(int[] arr, int X) {
        int count = 0;  // Initialize the count of pairs to zero
        int left = 0;   // Pointer for the leftmost element
        int right = arr.length - 1;  // Pointer for the rightmost element

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == X) {
                count++;  // Found a pair with the desired sum
                left++;   // Move the left pointer to the right
                right--;  // Move the right pointer to the left
            } else if (currentSum < X) {
                left++;   // Current sum is too small, move the left pointer to the right
            } else {
                right--;  // Current sum is too large, move the right pointer to the left
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 6};
        int X1 = 1;
        System.out.println(countPairsWithSum(arr1, X1));  // Output: 0

        int[] arr2 = {0, 15, 32, 2000, 15000};
        int X2 = 15;
        System.out.println(countPairsWithSum(arr2, X2));  // Output: 1

        int[] arr3 = {1, 1, 10, 32, 41};
        int X3 = 42;
        System.out.println(countPairsWithSum(arr3, X3));  // Output: 2
    }
}
