package com.greatlearning.tree.main;

import com.greatlearning.tree.service.FindSumPair;
import com.greatlearning.tree.service.Node;

public class Driver {

	public static void main(String[] args) {
		// Driver code for finding the pair with given sum
		Node root = null;
		FindSumPair fsp = new FindSumPair();
		root = fsp.insert(root, 40);
		root = fsp.insert(root, 20);
		root = fsp.insert(root, 60);
		root = fsp.insert(root, 10);
		root = fsp.insert(root, 30);
		root = fsp.insert(root, 50);
		root = fsp.insert(root, 70);
		int sum = 130;
		fsp.findPairWithGivenSum(root, sum);

	}

}
