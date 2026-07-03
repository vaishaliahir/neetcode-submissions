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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null)
        {
            return ans;
        }        
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty())
        {
            int size=que.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode t1=que.poll();
                level.add(t1.val);
                if(t1.left!=null)
                {
                    que.add(t1.left);
                }
                if(t1.right!=null)
                {
                    que.add(t1.right);
                }
             
            }
            ans.add(level);   
            
        }
        return ans;
    }

}
