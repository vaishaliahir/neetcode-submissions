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

    public String preorder(TreeNode node)
    {
        if(node==null)
        {
            return "null";
        }
        StringBuilder sb=new StringBuilder(" ");
        sb.append(node.val);
        sb.append(preorder(node.left));
        sb.append(preorder(node.right));

        return sb.toString();
    }
        public boolean isSubtree(TreeNode root, TreeNode subRoot) 
        {
            String fulltree=preorder(root);
            String sub=preorder(subRoot);

            return fulltree.contains(sub);
        }
      
}
