public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "N,";

        return root.val + "," +
               serialize(root.left) +
               serialize(root.right);
    }

    int idx;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        idx = 0;
        return build(arr);
    }

    private TreeNode build(String[] arr) {
        if (arr[idx].equals("N")) {
            idx++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
        node.left = build(arr);
        node.right = build(arr);

        return node;
    }
}