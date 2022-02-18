package queueops;
class QueueUsingArray{
	int front_Q,rear_Q;
	int capacityOfQ;
	static int[] q1;//initiation is done in contructor
	
	//Constructor
	QueueUsingArray(int size)
	{
		capacityOfQ=size;
		q1=new int[capacityOfQ];//queue size using array 
	}
	//Insertion of elements into queue
	void enqueue(int value)
	{
		if(rear_Q==capacityOfQ)
		{
			System.out.println("Queue is full can't insert");
		}
		else
		{
			q1[rear_Q]=value;//inserting at rear 
			rear_Q++;//rear is incremented every time till full
		}
	}
	
	//deletion of elements
	void dequeue()
	{
		if(rear_Q==0)
		{
			System.out.println("Queue is empty can't delete");
		}
		else
		{
			for(int i=0;i<rear_Q-1;i++)
			{
				q1[i]=q1[i+1];
			}
			rear_Q--;
		}
	}
	
	//queue is displayed
	void display()
	{

		
		if(rear_Q==0)
		{
			System.out.println("Queue is empty nothing to display");
		}
		else
		{
			for(int i=0;i<rear_Q;i++)
			{
				System.out.print(q1[i] +" ");
			}
		}
	}
}


public class Queueops {
public static void main(String[] args) {
	
	QueueUsingArray q2=new QueueUsingArray(5);//size is passed here
	q2.enqueue(2);
	q2.enqueue(5);
	q2.enqueue(6);
	q2.enqueue(12);
	System.out.println();
	q2.display();
	System.out.println();
	
	q2.dequeue();
	System.out.println();
	q2.display();
	
	
}
}
