class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        int cnt=0;
        int secondsmallest=Integer.MIN_VALUE;
        int n=nums.length;
        if(n==0)
        return 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]-1 == secondsmallest){
                cnt++;;
                secondsmallest=nums[i];
            }
            else if(nums[i]!=secondsmallest){
                cnt=1;
                secondsmallest=nums[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}