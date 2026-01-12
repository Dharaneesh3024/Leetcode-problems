class Solution {
    public String getHint(String secret, String guess) {
        int hsh[]=new int[10];
        int bulls=0,cows=0;
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                bulls++;}
            else{
                if(hsh[s-'0']++<0){
                    cows++;
                }
                if(hsh[g-'0']-->0){
                    cows++;
                }}}
        return bulls+"A"+cows+"B";
    }
}