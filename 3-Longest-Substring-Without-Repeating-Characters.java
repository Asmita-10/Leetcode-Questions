class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max_len=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            max_len=Math.max(max_len,i-l+1);
        }
        return max_len;
    }
}