class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int addend = target - nums[i];

            if (map.containsKey(addend)){
                result[0] = map.get(addend);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}