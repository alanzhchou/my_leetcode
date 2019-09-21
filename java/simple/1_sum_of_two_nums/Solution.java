class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            boolean result = values.containsKey(target-nums[i]);
            if (result){
                return new int[]{values.get(target-nums[i]),i} ;
            }
            values.put(nums[i],i);
        }
        return null;
    }
}