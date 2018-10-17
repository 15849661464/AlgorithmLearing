package com.zuoyan.bfs;

/**
 * 自定义队列
 * @author Administrator
 *
 */
public class Queue {
	
	
	private final int SIZE = 20;
	//队列的数组
	private int [] queArray;
	//队列的头部
	private int front;
	//队列的尾部
	private int rear;
	
	public Queue(){
		queArray = new int[SIZE];
		front = 0;
		rear = -1;
	}

	// 像数组中插入元素
	public void insert(int j)
	{
		//如果队列中的元素满了，就将尾部 的坐标移到 -1，从新开始添加
		if(rear == SIZE-1)
		{
			rear = -1;
		}
		queArray[++rear] = j;
	}
	
	//从数组中移出元素
	public int remove()
	{
		
		int temp = queArray[front++];
		if(front==SIZE)
			front =0;
		return temp;
	}
	
	//判断队列是否为空
	public boolean isEmpty(){
		return (rear+1==front || front+SIZE-1==rear);
	}
}
