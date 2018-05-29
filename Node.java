package com.singlylinkedlist;

/*
* @author Manoj Kumar
* @since 29/05/2018
*
* @class Node defines the basic structure that a node will have. 
* A node in singly linked list contains data and a link.
*
*
*/
class Node{
	/*
	* data contains the actual value
	* next contains the address of the next node
	*/
	int data;
	int next;

	/*
	* constructor initalizing data and next to null
	*/
	public Node(){
		data=0;
		next=null;
	}

	/*
	* constructor initializing data and next to the actual value of the current node
	* next contains the address of the next node
	*/
	public Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	/*
	* getters and setters for both the attributes
	*/

	public void setData(int data){
		this.data=data;
	}

	public int getData(){
		return this.data;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return this.next;
	}
}
