class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums1){
            int freq=map.getOrDefault(i,0);
            map.put(i,freq+1);
        }
        for(int i:nums2){
            if(map.get(i)!=null && map.get(i)>0){
                set.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[] ans=new int[set.size()];
        int idx=0;
        for(int i:set){
            ans[idx]=i;
            idx++;
        }
        return ans;
    }
}