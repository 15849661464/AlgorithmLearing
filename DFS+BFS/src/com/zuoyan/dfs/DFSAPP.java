package com.zuoyan.dfs;

public class DFSAPP {

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

		System.out.print("Visits:");
		// 深度优先搜索
		theGraph.dfs();
		System.out.println();
		// 广度优先搜索
		theGraph.bfs();
		System.out.println();

	}

}
