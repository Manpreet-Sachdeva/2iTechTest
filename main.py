def count_pairs_with_sum(arr, X):
    count = 0  # Initialize the count of pairs to zero
    left = 0   # Pointer for the leftmost element
    right = len(arr) - 1  # Pointer for the rightmost element

    while left < right:
        current_sum = arr[left] + arr[right]

        if current_sum == X:
            count += 1  # Found a pair with the desired sum
            left += 1   # Move the left pointer to the right
            right -= 1  # Move the right pointer to the left
        elif current_sum < X:
            left += 1   # Current sum is too small, move the left pointer to the right
        else:
            right -= 1  # Current sum is too large, move the right pointer to the left

    return count

# Test cases
print(count_pairs_with_sum([3, 4, 5, 6], 1))  # Output: 0
print(count_pairs_with_sum([0, 15, 32, 2000, 15000], 15))  # Output: 1
print(count_pairs_with_sum([1, 1, 10, 32, 41], 42))  # Output: 2
