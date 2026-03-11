class Solution {
    public int orangesRotting(int[][] grid) {
        int empty=0;
        int fresh=1;
        int rotten=2;
        int fresh_cnt=0;
        int mins=-1;
        Queue<int[]> q=new LinkedList<>();
        int r=grid.length,c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==rotten){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==fresh){
                    fresh_cnt++;
                }
            }
        }
        if(fresh_cnt==0) return 0;
        while(!q.isEmpty()){
            int q_size=q.size();
            mins++;

        for(int k=0;k<q_size;k++){
            int[] pos=q.poll();
            int i=pos[0],j=pos[1];
            for(int[] direction:new int[][]{{0,1},{1,0},{0,-1},{-1,0}}){
                int curr_r=i+direction[0];
                int curr_c=j+direction[1];
                if(curr_r>=0 && curr_r<r && curr_c>=0 && curr_c<c &&
                grid[curr_r][curr_c]==fresh){
                    grid[curr_r][curr_c]=rotten;
                    fresh_cnt--;
                    q.offer(new int[]{curr_r,curr_c});
                }
            }
        }
        }
        return fresh_cnt==0?mins:-1;
    }
}