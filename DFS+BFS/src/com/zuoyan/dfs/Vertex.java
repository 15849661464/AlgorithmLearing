package com.zuoyan.dfs;
/**
 * 图的每个顶点
 * @author Administrator
 *
 */
public class Vertex {
	
	//该顶点的标签
	public char label;
	//标识该定点有无被访问过
	public boolean wasVisited;
	
	
	public Vertex(char lab){
		//标识该标签
		label = lab;
		//初始化顶点时默认没有被访问过
		wasVisited = false;
		
	}

}
