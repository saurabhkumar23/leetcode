class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int amt = 0;
            for(int j=0;j<accounts[i].length;j++){
                amt += accounts[i][j];
            }
            wealth = Math.max(wealth,amt);
        }
        return wealth;
    }
}