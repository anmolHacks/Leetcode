class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(n==k){
            int sum=0;
            for(int i=0;i<n;i++){
                 sum+=cardPoints[i];
            }
            return sum;
        }
        int lsum=0;
        int rsum=0;
        int ridx=n-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int maxsum=lsum;
        for(int i=k-1;i>=0;i--){
          lsum=lsum-cardPoints[i];
          rsum=rsum+cardPoints[ridx];
          ridx--;
          int sum=lsum+rsum;
          maxsum=Math.max(maxsum,sum);
        }
    return maxsum;
    }
}