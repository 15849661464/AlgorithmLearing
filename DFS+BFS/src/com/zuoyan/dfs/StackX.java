package com.zuoyan.dfs;
/**
 * 自定义一个栈的数据结构
 * @author Administrator
 *
 */
public class StackX {
	private final int SIZE=20;
	private int [] st;
	private int top;
	public StackX()
	{
		st = new int[SIZE];
		top = -1;
		
	}
		
	public void push (int j)
	{
		//先++ 在赋值
		st[++top] = j;
	}
	
	public int pop(){
		//先返回在弹出
		return st[top--];
	}
	
	public int peek()
	{
		return st[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
}
