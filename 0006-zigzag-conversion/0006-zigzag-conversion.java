class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows > s.length()) {
            return s;
        }
        int ind = 0, j = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }
        for (char ch : s.toCharArray()) {
            rows[ind].add(ch);
            if (ind == 0) {
                j = 1;
            } else if (ind == numRows - 1) {
                j = -1;
            }
            ind += j;
        }
        StringBuilder res=new StringBuilder();
        for(List <Character> row:rows){
           for (char c : row) {
                res.append(c);
            }
        }
        return res.toString();
    }
}