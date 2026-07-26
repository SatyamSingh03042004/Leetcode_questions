class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count2=0;
        int[] arr1=new int[n/2];
        int[] arr2=new int[n/2];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr1[count1]=nums[i];
                count1++;
            }
            else{
                arr2[count2]=nums[i];
                count2++;
            }

        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=arr1[c1];
                c1++;
            }
            else{
                nums[i]=arr2[c2];
                c2++;
            }
        }
        return nums;
    }
}