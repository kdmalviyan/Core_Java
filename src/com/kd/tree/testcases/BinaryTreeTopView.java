package com.kd.tree.testcases;

import java.util.Stack;

import com.kd.example.Node;

//top view islist of all non leaf node
public class BinaryTreeTopView {

	public static void main(String[] args) {
		Node root = createTree();
		// printTree(root);
		printTopView(root);
	}

	public static void printTopView(Node root) {
		/*
		 * if (root != null) { printTopView(root.left); if (root.left != null ||
		 * root.right != null) { System.out.print(root.data + " "); }
		 * printTopView(root.right); }
		 */
		Node curr = root;
		Stack<Node> stack = new Stack<Node>();
		while (curr != null) {
			stack.push(curr);
			curr = curr.left;
		}

		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data + " ");
		}

		curr = root.right;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	public static void printTree(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			printTree(root.left);
			printTree(root.right);
		}
	}

	public static Node createTree() {
		Node tree = new Node(3);
		tree.left = new Node(5);
		tree.left.left = new Node(1);
		tree.left.right = new Node(4);
		tree.left.left.right = new Node(9);
		tree.right = new Node(2);
		tree.right.left = new Node(6);
		tree.right.right = new Node(7);
		tree.right.right.left = new Node(8);
		return tree;
	}
}
