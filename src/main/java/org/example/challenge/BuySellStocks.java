package org.example.challenge;

public class BuySellStocks {

    public int maxProfit(int[] stockPrices) {

        if (stockPrices==null||stockPrices.length==0) return 0;

        int profit = 0;

        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] > stockPrices[i - 1]) {
                profit += stockPrices[i] - stockPrices[i - 1];
            }
        }
        System.out.println(profit);
        return profit;
    }
}
