class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashMap to store numbers and their indices
        Map<Integer,Integer> map = new HashMap<>();

        //Iterate through the array
        for (int i=0;i< nums.length;i++){
             int complement= target-nums[i];
        
             

        //Check if the complement  is already in the map
        if(map.containsKey(complement)){
            //If found return the indices of the complement and the current number
            return new int[] { map.get(complement),i};
            
        }
         //otherwise add the current number and its index to the map
        map.put(nums[i],i);
        
        }
       
// return an empty  array  if no solution is found (this cast won't occur as per problem contraints)
return new int[] {};

}}