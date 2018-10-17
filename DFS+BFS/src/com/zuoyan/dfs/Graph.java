package com.zuoyan.dfs;

import com.zuoyan.bfs.Queue;

/**
 * 图
 * 
 * @author Administrator
 *
 */
public class Graph {

	// 设置图的最大顶点数目
	private final int MAX_VERTS = 20;
	// 顶点数组
	private Vertex[] vertexList;
	// 邻接矩阵 存放顶点之间的链接关系
	private int adjMat[][];
	// 当前顶点数目
	private int nVerts;
	// 深度优先搜索用的栈
	private StackX theStack;
	
	// 广度优先搜索用的队列
	private Queue theQueue;

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		theStack = new StackX();
		theQueue = new Queue();
		
		//将邻接矩阵中的顶点关系全部初始化没有关系
		for (int j = 0; j < MAX_VERTS; j++) {
			for (int k = 0; k < MAX_VERTS; k++) {
				adjMat[j][k] = 0;
			}
		}
		

	}

	// 添加顶点
	public void addVertex(char lable) {
		vertexList[nVerts++] = new Vertex(lable);
	}

	// 添加边 是双向操作  就是每个顶点之间的关系
	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;

	}

	// 显示顶点
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}

	
	// 广度优先搜索
	public void bfs() {
		// 第一个顶点 记下来标志为访问过的
		vertexList[0].wasVisited = true;
		// 显示访问的顶点
		displayVertex(0);
		//将这个顶点的下标放入队列中
		theQueue.insert(0);

		int v2;
		while (!theQueue.isEmpty()) {
			// 从队头取出第一个元素
			int v1 = theQueue.remove();
			while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				theQueue.insert(v2);
			}
		}

		// 将访问还原
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}
	}

	// 深度优先搜索
	public void dfs() {
		// 第一个顶点 记下来标志为访问过的
		vertexList[0].wasVisited = true;
		// 显示访问的顶点
		displayVertex(0);
		// 将第一个顶点放入到栈中
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int v = getAdjUnvisitedVertex(theStack.peek());
			if (v == -1) {
				// 如果该顶点 没有与之相邻的顶点 那就将该顶点移出栈中
				theStack.pop();
			} else {
				// 设置这个顶点 为访问过的，然后 显示这个顶点的标识符 将该顶点放入栈中，继续搜索
				vertexList[v].wasVisited = true;
				// 显示顶点
				displayVertex(v);
				// 将该顶点放入到栈中
				theStack.push(v);

			}
		}

		// 将访问还原
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}

	}

	// 获取 未访问过的顶点 获取指定顶点相连接 一个为被访问过的顶点
	public int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < nVerts; j++) {
			if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
				return j; // 找到了一个与v顶点相连接的 这是一个位置
			}

		}
		return -1; // 未找到
	}

}
