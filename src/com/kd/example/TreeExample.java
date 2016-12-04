package com.kd.example;

public class TreeExample {
	public static class Node {
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		int data;
		Node left;
		Node right;
	}

	public static void main(String[] args) {
		Node root = null;// new Node(3);
		// 7 3 5 2 1 4 6 7
		root = insert(root, 7);
		root = insert(root, 3);
		root = insert(root, 4);
		root = insert(root, 5);
		root = insert(root, 1);
		root = insert(root, 4);
		root = insert(root, 5);
		root = insert(root, 7);
		/*
		 * root.left = new Node(5); root.left.left = new Node(1);
		 * root.left.right = new Node(4);
		 * 
		 * root.right = new Node(2); root.right.right = new Node(8);
		 * root.right.left = new Node(6);
		 */

		System.out.println(getHeight(root));
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	static int count = 0;

	public static int size(Node root) {
		if (root != null) {
			count++;
			size(root.left);
			size(root.right);
		}
		return count;
	}

	public static int getHeight(Node root) {
		if (root == null)
			return -1;
		int lefth = getHeight(root.left);
		int righth = getHeight(root.right);

		if (lefth > righth) {
			return lefth + 1;
		} else {
			return righth + 1;
		}
	}

	static int getLeafCount(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}

	public static void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data + " ");
		}
	}

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data + " ");
			inOrder(root.right);
		}
	}

}
