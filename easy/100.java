class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // just logical operators magic...
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }
}