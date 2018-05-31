package com.singlylinkedlist;

/*
* @author Manoj Kumar
* @since 29/05/2018
*
*/
import com.singlylinkedlist.*;

public class SinglyLinkedList{

	Node start,end;
	int size;

	public SinglyLinkedList(){
		start=end=null;
		size=0;
	}
	// method for getting the size
	public int getSize(){
		return this.size;
	}

	// method for checking the linkedlist is empty or not
	public boolean isEmpty(){
		if(start==null)
			return true;		
		else
			return false;

	}

	// method for inserting a node at the beginning of the list
	public void insertAtBegin(int data){
		Node obj1=new Node(data,null);
		size++;
		/*
		* if start is null then assign the node to the start and end to the start. ie means there is a single node in the list
		* if start is not null, then assign the new node object to the start by calling the set link method and set the data also
		*/
		if(start==null){
			start=obj1;
			end=start;

		}
		else{
			obj1.setNext(start);
			start=obj1;

		}

	}

	// method for inserting a node at the end of the list
	public void insertAtEnd(){

	}

	// method for inserting a node at a specific position in the list
	public void insertAtPosition(){

	}

	public void display(){

		if(size==0) {
			System.out.println("List is Empty");
		}
		if(start.getNext()==null){
			System.out.println(start.getData());
			System.out.println("There is only one node in the list");
			return ;
		}


		// assing the start to the another variable of node type

		Node ptr=start.getNext();
		System.out.print(start.getData() +"->");

		while(ptr.getNext()!=null){
			System.out.print(ptr.getData()+"->");
			ptr=ptr.getNext();
		}

		System.out.println(ptr.getData());



	}


}
