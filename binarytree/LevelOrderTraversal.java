package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	TreeNode root;
	
	public static void main(String[] args) {
		LevelOrderTraversal tree_level = new LevelOrderTraversal();
		tree_level.root = new TreeNode(10); 
        tree_level.root.left = new TreeNode(10); 
        tree_level.root.right = new TreeNode(19); 
        tree_level.root.left.left = new TreeNode(-5); 
        tree_level.root.right.left = new TreeNode(17); 
        tree_level.root.right.right = new TreeNode(21); 
        tree_level.traversal(tree_level.root);
        
	}

	private void traversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
		}
	}

}
