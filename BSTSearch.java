class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BSTSearch {
    public static TreeNode searchBST(TreeNode root, int target) {
        if (root == null || root.val == target) {
            return root;
        }

        if (target < root.val) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

        int target = 6;
        TreeNode result = searchBST(root, target);

        if (result != null) {
            System.out.println("Found: " + result.val);
        } else {
            System.out.println("Value not found in BST.");
        }
    }
}
