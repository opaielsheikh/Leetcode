class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyList = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int findValue = (target - nums[i]);
            if(keyList.containsKey(findValue)){
                return new int[] { keyList.get(findValue), i};
            }
            keyList.put(nums[i], i);
        }
        return null;
    }
}
