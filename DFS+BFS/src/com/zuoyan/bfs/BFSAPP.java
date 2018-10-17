package com.zuoyan.bfs;

import com.zuoyan.dfs.Graph;

public class BFSAPP {

	public static void main(String[] args) {
		// 新创建一个图
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		// A-B
		theGraph.addEdge(0, 1); // AB
		theGraph.addEdge(0, 2); // AC
		theGraph.addEdge(0, 3); // AD
		theGraph.addEdge(1, 3); // BD
        theGraph.addEdge(3, 4); // DE
		System.out.print("Visits:");
		// 深度优先搜索
		theGraph.bfs();
		System.out.println();
	}

}
