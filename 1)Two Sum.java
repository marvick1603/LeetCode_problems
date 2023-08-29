// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;;
        int[] ans = new int[2];
        for(int i=0;i<l;i++){
            int f=target-nums[i];
            for(int j=i+1;j<l;j++){
                if(nums[j]==f){
                    ans[0]=i;
                    ans[1]=j;               }
            }
        }
        
        return ans;
        
        
        
    }
}
