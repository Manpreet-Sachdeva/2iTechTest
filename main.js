function countPairsWithSum(arr, X) {
    let count = 0;  // Initialize the count of pairs to zero
    let left = 0;   // Pointer for the leftmost element
    let right = arr.length - 1;  // Pointer for the rightmost element

    while (left < right) {
        const currentSum = arr[left] + arr[right];

        if (currentSum === X) {
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

// Test cases
const arr1 = [3, 4, 5, 6];
const X1 = 1;
console.log(countPairsWithSum(arr1, X1));  // Output: 0

const arr2 = [0, 15, 32, 2000, 15000];
const X2 = 15;
console.log(countPairsWithSum(arr2, X2));  // Output: 1

const arr3 = [1, 1, 10, 32, 41];
const X3 = 42;
console.log(countPairsWithSum(arr3, X3));  // Output: 2
