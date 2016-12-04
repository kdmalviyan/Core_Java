package com.kd.example;

public class BinaryTree {
	public Node root;

	public void insert(Node root, int data) {
		if (root == null)
			this.root = new Node(data);
		else {
			Node current = root;
			while (current != null) {
				if (current.right == null && data >= current.data) {
					current.right = new Node(data);
					return;
				}
				if (current.left == null && data < current.data) {
					current.left = new Node(data);
					return;
				}
				if (data > current.data) {
					current = current.right;
				} else {
					current = current.right;
				}
			}
		}
	}
}
