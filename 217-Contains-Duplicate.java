class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int freq=map.getOrDefault(i,0);
            map.put(i,freq+1);
        }
        for(int i:nums){
            if(map.get(i)==1){
                continue;
            }
            else{
                return true;
            }
        }
        return false;
    }
}