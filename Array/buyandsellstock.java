class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int profit = 0;
        int cal=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                 cal=nums[j]-nums[i];
                 if(cal>profit){
                     profit=cal;
                 }
            }
            
        }
        return profit;
    }
}