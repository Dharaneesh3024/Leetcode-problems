class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0;
        int min_height=-1;
        int width=0;
        int area=0;
        while(left<right){
            min_height=Math.min(height[left],height[right]);
            width=right-left;
            area=min_height*width;
            res=Math.max(area,res);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}