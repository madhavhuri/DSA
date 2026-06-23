class Solution {
    public int maxSubArray(int[] nums) {
      int n = nums.length;
      int fb = 0;
      int mw = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        fb = Math.max(nums[i],nums[i]+fb);
        mw = Math.max(mw,fb);
      }  
      return mw;
    }
}