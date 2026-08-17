class Solution {
    public boolean canConstruct(String s, int k) {
        int oddCount=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(char ch: s.toCharArray()){
            if(hm.get(ch)%2!=0 && hm.get(ch)!=-1){
                oddCount++;
                hm.put(ch,-1);
            }
        }
        return oddCount<=k && k<=s.length();

    }
}