class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;

        // Maximum gain from left and right
        int left = Math.max(0, dfs(node.left));
        int right = Math.max(0, dfs(node.right));

        // Path passing through current node
        int currentPath = left + right + node.val;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPath);

        // Return maximum gain to parent
        return node.val + Math.max(left, right);
    }
}