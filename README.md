# LeetCode — Java

Solutions solved as part of a structured backend engineering prep roadmap.
Each solution favors the most efficient approach; brute-force is used first only when it's the natural starting point for understanding the problem.

## Solutions

| Problem | Difficulty | Pattern | Complexity | Solution |
|---|---|---|---|---|
| Two Sum | Easy | Brute force, nested loop | O(n²) | [TwoSum.java](src/arrays/TwoSum.java) |
| Contains Duplicate | Easy | Brute force, pairwise comparison | O(n²) | [ContainsDuplicate.java](src/arrays/ContainsDuplicate.java) |
| Best Time to Buy and Sell Stock | Easy | Single-pass, running minimum | O(n) | [MaxProfit.java](src/arrays/MaxProfit.java) |
| Fibonacci Number | Easy | Iterative state tracking | O(n) | [Fibonacci.java](src/dp/Fibonacci.java) |
| Binary Search | Easy | Divide and conquer, overflow-safe midpoint | O(log n) | [BinarySearch.java](src/binary_search/BinarySearch.java) |
| Valid Anagram | Easy | Character frequency counting | O(n) | [ValidAnagram.java](src/strings/ValidAnagram.java) |
| Move Zeroes | Easy | In-place two-pass array manipulation | O(n) | [MoveZeroes.java](src/arrays/MoveZeroes.java) |
| Valid Palindrome | Easy | Two-pointer with character filtering | O(n) | [ValidPalindrome.java](src/strings/ValidPalindrome.java) |
| Merge Sorted Array | Easy | Two-pointer, merged backward in place | O(m+n) | [MergeSortedArray.java](src/two_pointers/MergeSortedArray.java) |
| Remove Duplicates from Sorted Array | Easy | Slow/fast pointer, in-place compaction | O(n) | [RemoveDuplicates.java](src/two_pointers/RemoveDuplicates.java) |
| Majority Element | Easy | Boyer-Moore voting | O(n) | [MajorityElement.java](src/arrays/MajorityElement.java) |
| Transpose Matrix | Easy | 2D array dimension swap | O(rows×cols) | [TransposeMatrix.java](src/matrix/TransposeMatrix.java) |
| Maximum Subarray | Medium | Kadane's algorithm | O(n) | [MaxSubArray.java](src/arrays/MaxSubArray.java) |
| Squares of a Sorted Array | Easy | Two-pointer, build result from outside-in | O(n) | [SortedSquares.java](src/two_pointers/SortedSquares.java) |
| Rotate Array | Medium | Triple in-place reversal | O(n) | [RotateArray.java](src/arrays/RotateArray.java) |
| Plus One | Easy | Digit array manipulation with carry | O(n) | [PlusOne.java](src/arrays/PlusOne.java) |

## Conventions
- One file per problem, named after the problem (not `Solution`) to avoid class-name collisions within the same package
- Package structure mirrors the problem's core pattern: `arrays`, `dp`, `binary_search`, `strings`, `two_pointers`, `matrix`
- When submitting to LeetCode directly, rename the class back to `Solution` — LeetCode compiles each submission in isolation, so this repo's naming convention doesn't apply there