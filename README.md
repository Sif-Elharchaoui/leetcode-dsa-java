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
| Two Sum (HashMap) | Easy | Single-pass hash lookup, complement search | O(n) | [TwoSumHashMap.java](src/hashmap/TwoSumHashMap.java) |
| Contains Duplicate (HashSet) | Easy | Single-pass set membership check | O(n) | [ContainsDuplicateHashSet.java](src/hashset/ContainsDuplicateHashSet.java) |
| Valid Anagram (HashMap) | Easy | Character frequency map, `getOrDefault` | O(n) | [ValidAnagramHashMap.java](src/hashmap/ValidAnagramHashMap.java) |
| Ransom Note | Easy | Character frequency map, availability check | O(n) | [RansomNote.java](src/hashmap/RansomNote.java) |
| Valid Parentheses | Easy | Stack-based bracket matching | O(n) | [ValidParentheses.java](src/stack/ValidParentheses.java) |
| Min Stack | Medium | Design - dual stack tracking running minimum | O(1) per op | [MinStack.java](src/stack/MinStack.java) |
| Baseball Game | Easy | Stack application - running score history | O(n) | [BaseballGame.java](src/stack/BaseballGame.java) |
| Implement Queue using Stacks | Easy/Medium | Design - FIFO built from two LIFO stacks | O(1) amortized | [QueueUsingStacks.java](src/stack/QueueUsingStacks.java) |
| String to Integer (atoi) | Medium | Robust parsing - whitespace, sign, overflow clamping | O(n) | [StringToInteger.java](src/strings/StringToInteger.java) |
| Add Binary | Easy | Digit-by-digit carry, StringBuilder | O(n) | [AddBinary.java](src/strings/AddBinary.java) |
| Add Strings | Easy | Digit-by-digit carry, base 10 | O(n) | [AddStrings.java](src/strings/AddStrings.java) |
| Roman to Integer | Easy | HashMap lookup with subtractive notation edge case | O(n) | [RomanToInteger.java](src/strings/RomanToInteger.java) |

## Conventions
- One file per problem, named after the problem (not `Solution`) to avoid class-name collisions within the same package
- Package structure mirrors the problem's core pattern: `arrays`, `dp`, `binary_search`, `strings`, `two_pointers`, `matrix`
- When submitting to LeetCode directly, rename the class back to `Solution` — LeetCode compiles each submission in isolation, so this repo's naming convention doesn't apply there