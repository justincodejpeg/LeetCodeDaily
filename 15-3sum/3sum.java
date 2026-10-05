class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList();

        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){

                int target = 0-nums[i];
                int leftPointer = i+1;
                int rightPointer = nums.length-1;

                //multiple while loops to check the lists inside the list
                while(leftPointer< rightPointer){
                    if (nums[leftPointer] + nums[rightPointer] == target){
                        result.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                        while(leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer+1]) {
                            leftPointer++;
                        }
                        while(leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer-1]) {
                            rightPointer--;
                        }
                        leftPointer++;
                        rightPointer--;
                    } else if (nums[leftPointer] + nums[rightPointer] > target) {
                        rightPointer--;
                    } else {
                        leftPointer++;
                    }
                }
            }
        }
        return result;
    }
}