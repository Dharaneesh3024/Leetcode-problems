class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String prefix=strs[0];
        int prefix_len=prefix.length();
        for(int i=1;i<strs.length;i++){
            String current=strs[i];
        while (prefix_len > current.length() || !(prefix.equals(current.substring(0,prefix_len)))){
                prefix_len--;
                if(prefix_len==0){
                    return "";
                }
            prefix=prefix.substring(0,prefix_len);
            }
        }
        return prefix;
    }
}