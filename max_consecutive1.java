class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       /* int prev=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]==1 && i==nums.length-1)
            {
               count++;
                if(count>prev)
                {
                    prev=count;
                    count=0;
                }
                else if(count<=prev)
                {
                    count=0;
                }
            } 
           else if(nums[i]==1)
            {
                count++;
            }
            else if(nums[i]==0)
            {
                if(count>prev)
                {
                    prev=count;
                    count=0;
                }
                else if(count<=prev)
                {
                    count=0;
                }
            }
           
        }
        return prev;*/