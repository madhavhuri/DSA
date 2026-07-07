class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>m= new HashMap<>();
        int l =0,maxlen=0;
        for(int r=0;r<s.length();r++){
            char ch =  s.charAt(r);
            m.put(ch, m.getOrDefault(ch,0)+1);

        while(m.get(ch)>1){
            char leftchar = s.charAt(l);
            m.put(leftchar,m.getOrDefault(leftchar,0)-1);
            l++;
        }
        maxlen = Math.max(maxlen,r-l+1);
    }
    return maxlen;
    }
}