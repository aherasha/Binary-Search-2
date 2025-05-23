//Did this code successfully run on Leetcode :  Yes
//Any problem you faced while coding this :  No
//Time complexity - O(logn)
//Space complexity - O(1)
class FindPeakElementLC162 {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if((mid == 0 || nums[mid] > nums[mid-1])
                    && (mid == nums.length -1 || nums[mid] > nums[mid+1])) {
                return mid;
            }
            else if(mid !=0 && nums[mid] < nums[mid-1]) {
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }
}