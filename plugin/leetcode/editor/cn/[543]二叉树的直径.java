
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        //有可能最大直径不过根节点，出现在左右子树中
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        //有可能最大直径过根节点，既为左子树最大深度+右子树最大深度
        int lMaxDepth = getMaxDepth(root.left);
        int rMaxDepth = getMaxDepth(root.right);

        //判断过不过根节点的两个直径哪个最大
        return Math.max(lMaxDepth + rMaxDepth, Math.max(ld, rd));
    }

    public int getMaxDepth(TreeNode root) {
        if (root == null) return 0;
        int lmax = getMaxDepth(root.left);
        int rmax = getMaxDepth(root.right);
        return Math.max(lmax, rmax) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
