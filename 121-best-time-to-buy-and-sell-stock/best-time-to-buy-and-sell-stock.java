class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, buy = Integer.MAX_VALUE;

        for(int price: prices) {
            res = Math.max(res, price - buy);
            buy = Math.min(buy, price);
        }

        return res;
    }
}