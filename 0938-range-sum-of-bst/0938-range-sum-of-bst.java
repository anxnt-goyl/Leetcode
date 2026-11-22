/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int ans ;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        dfs(root , low , high );
        return ans;
    }
    public void dfs(TreeNode node , int l , int r){
        if(node != null){
            if(node.val >= l && node.val <= r) ans += node.val;
            if(node.val > l )  dfs(node.left , l , r);
            if(node.val < r ) dfs(node.right , l , r);
        }
    }
}