class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>operations=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int targeted_ind=0;
        for(int num=1;num<=n && targeted_ind<target.length;num++){
            stack.push(num);
            operations.add("Push");
        
        if (num == target[targeted_ind]) {
                targeted_ind++;
            } else {
                stack.pop();
                operations.add("Pop");
            }
        }
        return operations;
    }
}