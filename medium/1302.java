class Solution {
    public int deepestLeavesSum(TreeNode root) {
        // do sum at level order traversal....
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int sum = 0;
        while(q.size()>0){
            int sz = q.size();
            sum = 0;
            while(sz-->0){
                TreeNode front = q.remove();
                sum += front.val;
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
            }
        }
        return sum;
    }
}