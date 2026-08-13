class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(char c:s.toCharArray()){
            int fre=map.getOrDefault(c,0);
            map.put(c,fre+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}