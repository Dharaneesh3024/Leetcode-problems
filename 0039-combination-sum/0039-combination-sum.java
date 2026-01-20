class Solution {
    void backtrack(int start,List <Integer> curr, List <List<Integer>>res,int[] candidates,int target){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList(curr));
        }
        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(i,curr,res,candidates,target-candidates[i]);
            curr.removeLast();
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,curr,res,candidates,target);
        return res;
    }
}