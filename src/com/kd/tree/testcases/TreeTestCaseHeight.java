package com.kd.tree.testcases;

import org.junit.Test;

import com.kd.example.TreeExample;

import org.junit.Assert;

public class TreeTestCaseHeight {
	@Test
	public void testGetHeight1() {
		TreeExample.Node root = null;
		root = TreeExample.insert(root, 1);
		root = TreeExample.insert(root, 10);
		// Assert.assertEquals(PreOrderExample.getHeight(root), 0);
	}

	@Test
	public void testGetHeight2() {
		TreeExample.Node root = null;
		/*
		 * 6 4 1 8 10 9 3
		 */
		root = TreeExample.insert(root, 6);
		root = TreeExample.insert(root, 4);
		root = TreeExample.insert(root, 8);
		root = TreeExample.insert(root, 10);
		root = TreeExample.insert(root, 9);
		root = TreeExample.insert(root, 3);
		Assert.assertEquals(TreeExample.getHeight(root), 3);
	}

	@Test
	public void testGetHeight3() {
		/*
		 * 15 1 3 2 5 4 6 7 9 8 11 13 12 10 15 14
		 */
		TreeExample.Node root = null;
		root = TreeExample.insert(root, 15);
		root = TreeExample.insert(root, 1);
		root = TreeExample.insert(root, 3);
		root = TreeExample.insert(root, 2);
		root = TreeExample.insert(root, 5);
		root = TreeExample.insert(root, 4);
		root = TreeExample.insert(root, 6);
		root = TreeExample.insert(root, 7);
		root = TreeExample.insert(root, 9);
		root = TreeExample.insert(root, 8);
		root = TreeExample.insert(root, 11);
		root = TreeExample.insert(root, 13);
		root = TreeExample.insert(root, 12);
		root = TreeExample.insert(root, 10);
		root = TreeExample.insert(root, 15);
		Assert.assertEquals(9, TreeExample.getHeight(root));
	}

	@Test
	public void testGetHeight4() {

	}

}
