class Solution {
    public int findPeakElement(int[] nums) {
        int c=0;
        if(nums.length==1)
        return 0;
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i==0)
                {
                    if(nums[0]>nums[1])
                    c=0;
                }
                else if(i>1 && i<nums.length-1)
                {
                    if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])
                    c=i;
                }
                else
                {
                    if(nums[i]>nums[i-1])
                    c=i;
                }
            }
            
        }
        return c;
    }
}


       