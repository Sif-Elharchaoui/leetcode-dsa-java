package arrays;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minimumPrice > prices[i]) {
                minimumPrice = prices[i];
            }

            int currentProfit = prices[i] - minimumPrice;
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }
        return profit;
    }
}