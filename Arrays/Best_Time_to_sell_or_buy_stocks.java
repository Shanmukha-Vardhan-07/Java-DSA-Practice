class Best_Time_to_sell_or_buy_stocks{
    public int maxProfit(int [] prices){
        int min_price=Integer.MAX_VALUE;
        int max_price=0;

        for(int price:prices){
            if(price<min_price){
                min_price=price;
            }
            int profit=price-min_price;

            if(profit>max_price){
                max_price=profit;
            }
        }
        return max_price;
    }

public static void main(String [] args){
    Best_Time_to_sell_or_buy_stocks obj=new Best_Time_to_sell_or_buy_stocks();

    int [] prices={7,1,5,3,6,4};

    int result=obj.maxProfit(prices);

    System.out.println("Result:"+result);

}
}