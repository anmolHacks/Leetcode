class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return maxx(nums,goal)-maxx(nums,goal-1);
    }
    public int maxx(int[] nums,int goal){
        if(goal < 0) return 0;
        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}