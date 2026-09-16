class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0;
        int j=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        while(j<n){
           if (mp.containsKey(fruits[j])){
                int temp=mp.get(fruits[j]);
                mp.put(fruits[j],temp+1);
            }
            else{
                mp.put(fruits[j],1);
            }
            while(mp.size()>2){
                 mp.put(fruits[i],(mp.get(fruits[i])-1));
                if(mp.get(fruits[i])==0){
                    mp.remove(fruits[i]);
                }
                i++;
            }
            if(mp.size()<=2){
            int maxc=j-i+1;
            count=Math.max(count,maxc); 
            j++;
            }
        }
        return count;
    }
}