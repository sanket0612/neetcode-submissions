class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productTillNow = 1;
        int[] resultFromLeft = new int[nums.length];
        
        resultFromLeft[0] = 1;
        for(int i = 1; i<nums.length; i++) {
            productTillNow *= nums[i-1];
            resultFromLeft[i] = productTillNow;
        }
        //1, 1, 2, 8
        productTillNow = 1;
        for(int i = nums.length-2; i>=0; i--) {
            productTillNow *= nums[i+1];
            resultFromLeft[i] *= productTillNow;
        }
        //[_,_,_,8]
        return resultFromLeft;
    }
}  
