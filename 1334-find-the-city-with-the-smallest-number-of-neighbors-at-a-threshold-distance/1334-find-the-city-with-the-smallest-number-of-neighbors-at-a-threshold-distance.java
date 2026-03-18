class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][]dist=new int[n][n];
        int inf=Integer.MAX_VALUE/2;
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],inf);
            dist[i][i]=0;
        }
        for(int edge[]:edges){
            int u=edge[0],v=edge[1],w=edge[2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
       for (int k = 0; k < n; k++) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (dist[i][k] + dist[k][j] < dist[i][j]) {
                dist[i][j] = dist[i][k] + dist[k][j];
            }
        }
    }
}
    int result = -1;
    int minCount = inf;
    
    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (j != i && dist[i][j] <= distanceThreshold) {
                count++;
            }
        }
        if (count <= minCount) { 
            minCount = count;
            result = i;
        }
    }
    return result;

    }
}