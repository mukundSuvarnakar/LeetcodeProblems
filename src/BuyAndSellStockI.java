public class BuyAndSellStockI {

    public static void main(String[] args) {

//        Input: prices = [7,1,5,3,6,4]
//        Output: 5

        int[] prices={7,1,5,3,6,4};
        int max=0;
        int profit=0;
        int min=prices[0];

        for(int i=0;i<prices.length;i++)
        {
            if(min >prices[i])
            {
                min=prices[i];
            }
            profit=prices[i]-min;
            max=Math.max(profit,max);
        }


        System.out.println(max);
    }
}
