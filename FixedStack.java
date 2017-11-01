package myPack;


	public class FixedStack implements Stack{
		
			final int arr[];
		//final keyword. The final is a keyword in java. Final can be variable, method, class or parameter.
		//creating an array
			 final int size;

			 int top;
		//it represents the top of the stack
		//Both insertion and deletion are allowed at only one end of Stack called Top.	 

			public  FixedStack (int size){
		//refers the current object
				 this.size=size;
		//here arr will create the new size
				 arr=new int[size];
		//0 based index for data structures like arrays, stacks, array lists, etc and hence the 
		//initialization value should be one preceding the starting value(here 0), which results in -1!
				 top = -1;

			 }



			/**
			 * These are the two methods from the interface Stack
			 */

			

			

			@Override

			public void push(int i) {
		//push an item onto a stack
				// TODO Auto-generated method stub

				  if (top == size - 1) {
		//top should be equal to the size-1;
			            System.out.println("Stack overflow while pushing " + i + " in fixed stack");

			            //throw new UnsupportedOperationException();

			            return;

			        }
		//
			        arr[++top] = i;

			    }	

			



			@Override

			public int pop() {

				// TODO Auto-generated method stub

				if (top < 0) {
					//if top is greater than 0

		            System.out.println("Stack underflow");

		            //throw new UnsupportedOperationException();

		            return -999;

		        }
		//values in the stack will be decremented
		        return arr[top --];

		    }

				

			}
