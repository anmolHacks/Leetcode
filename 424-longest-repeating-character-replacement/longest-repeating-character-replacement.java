class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxl=0;
        int maxf=0;
        int[] hash=new int[26];
        int n=s.length();
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            while(r-l+1-maxf>k){
                hash[s.charAt(l)-'A']--;
                maxf=0;
                for(int i=0;i<26;i++){
                    maxf=Math.max(maxf,hash[i]);
                }
                l++;
            }
            maxl = Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}