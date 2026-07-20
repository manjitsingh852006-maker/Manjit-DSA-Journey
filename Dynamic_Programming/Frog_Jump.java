import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    Boolean[][] dp;

    public boolean solve(int[] stones, int index, int lastJump) {

        // Reached last stone
        if (index == stones.length - 1) {
            return true;
        }

        // Already solved
        if (dp[index][lastJump] != null) {
            return dp[index][lastJump];
        }

        // Try k-1, k, k+1
        for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {

            if (jump <= 0) {
                continue;
            }

            int nextStone = stones[index] + jump;

            if (map.containsKey(nextStone)) {

                int nextIndex = map.get(nextStone);

                if (solve(stones, nextIndex, jump)) {

                    dp[index][lastJump] = true;
                    return true;
                }
            }
        }

        dp[index][lastJump] = false;
        return false;
    }

    public boolean canCross(int[] stones) {

        dp = new Boolean[stones.length][stones.length + 1];

        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], i);
        }

        return solve(stones, 0, 0);
    }
}