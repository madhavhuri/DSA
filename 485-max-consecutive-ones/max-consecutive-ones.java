class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxans = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
            }
            else{
                maxans = Math.max(maxans,count);
                count  = 0;
                
            }
            
        }
        return Math.max(maxans,count);
        
    }
}