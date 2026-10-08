class Solution {
    
    public int beautySum(String s) {
        

        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];

            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
            
                if(j-i+1<3)
                continue;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                total+=max-min;
            }
        }
        return total;
    }
}
