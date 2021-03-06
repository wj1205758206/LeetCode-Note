package codingoffer;

/**
 * 二叉搜索树的最近公共祖先
 */
public class CommonParentInTree_68 {
    public static void main(String[] args) {

    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return null;
            if (p.val < root.val && q.val < root.val)
                return lowestCommonAncestor(root.left, p, q);
            if (p.val > root.val && q.val > root.val)
                return lowestCommonAncestor(root.right, p, q);
            return root;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
