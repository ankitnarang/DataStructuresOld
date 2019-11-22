package binarytree;

/*
 * 
 * Left view of subtree
 * All visible nodes from left side and 
 * 
 */

public class LeftView {
	TreeNode root;
	private static int maxLevel = 0;
	
	public static void main(String[] args) {
		LeftView tree = new LeftView();
		tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        tree.root.left.left.left = new TreeNode(15); 
        tree.root.right.left = new TreeNode(6); 
        tree.root.right.right = new TreeNode(7); 
        tree.root.right.left.right = new TreeNode(9); 
        tree.root.right.left.right.left = new TreeNode(13);
        
        tree.printLeftView(tree.root,1);
        
	}

	private void printLeftView(TreeNode root, int level) {
		if(root == null)
				return;
		
		if(maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		
		printLeftView(root.left, level + 1);
		printLeftView(root.right, level + 1);
		
	}

}

