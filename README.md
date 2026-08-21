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

## Conventions
- One file per problem, named after the problem (not `Solution`) to avoid class-name collisions within the same package
- Package structure mirrors the problem's core pattern: `arrays`, `dp`, `two-pointers`, `strings`, etc.
- When submitting to LeetCode directly, rename the class back to `Solution` — LeetCode compiles each submission in isolation, so this repo's naming convention doesn't apply there