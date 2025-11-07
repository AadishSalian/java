import java.util.*;
class MyArrayList
{
	Scanner sc=new Scanner(System.in);
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist
	void listOperations()
	{
		while(true)
		{
			System.out.println("1.Add the element\n2.Add the element at specified location\n3.Remove the element\n4.Remove the element from the specified location\n5.Access the element\n6.Update the element\n7.Display elements of list\n8.Search the specified element\n9.Sort the list elements\n10.Exit...");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:System.out.println("Enter the string:");
				   String item=sc.nextLine();
				   list.add(item);
				   break;
			case 2:System.out.println("Enter the position");
			       int index=sc.nextInt();
			       sc.nextLine();
			       System.out.println("Enter the string element");
			       item=sc.nextLine();
			       list.add(index,item);
			       break;
			case 3:System.out.println("Enter the element to be deleted");
			       item=sc.nextLine();
			       list.remove(item);
			       break;
			case 4:System.out.println("Enter the index of the element to be deleted");
			       index=sc.nextInt();
			       list.remove(index);
			case 5:System.out.println("Enter the index");
			       index=sc.nextInt();
			       System.out.println(list.get(index));
			       break;
			case 6:System.out.println("Enter the position");
			       index=sc.nextInt();
			       sc.nextLine();
			       System.out.println("Enter the string element");
			       String ele=sc.nextLine();
			       list.set(index,ele);
			       break;
			case 7:System.out.println("List of elements are:"+list);  
			       break;
			case 8:System.out.println("Enter the element to be searched:");   
			       item=sc.nextLine();
			       if(list.contains(item))
			    	   System.out.println("Element found");
			       else
			    	   System.out.println("Element not found");
			       break;
			case 9:Collections.sort(list);
				   System.out.println("Sorted list is:"+list); 
				   break;
			case 10:return;
			}
		}
	}
}
class MyLinkedList
{
	Scanner sc=new Scanner(System.in);
	LinkedList<String> list=new LinkedList<String>();//Creating arraylist
	void LinkOperations()
	{
		while(true)
		{
			System.out.println("1.Add the element\n2.Add the element at specified location\n3.Add the element at the beginning\n4.Add element at the end\n5.Remove the element\n6.Remove the element from the specified location\n7.Remove the last element\n8.Remove the first element\n9.Access the element\n10.Update the element\n11.Display elements of list\n12.Search the specified element\n13.Sort the list elements\n14.Exit...");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:System.out.println("Enter the string:");
				   String item=sc.nextLine();
				   list.add(item);
				   break;
			case 2:System.out.println("Enter the position");
			       int index=sc.nextInt();
			       sc.nextLine();
			       System.out.println("Enter the string element");
			       item=sc.nextLine();
			       list.add(index,item);
			       break;
			case 3:System.out.println("Enter the string element");
		           item=sc.nextLine();  
		           list.addFirst(item);
		           break;
			case 4:System.out.println("Enter the string element");
	               item=sc.nextLine();  
	               list.addLast(item);
	               break;
			case 5:System.out.println("Enter the element to be deleted");
			       item=sc.nextLine();
			       list.remove(item);
			       break;
			case 6:System.out.println("Enter the index of the element to be deleted");
			       index=sc.nextInt();
			       list.remove(index);
			case 7:System.out.println("Removed last element is");  
	               list.removeLast();
	               break;   
			case 8:System.out.println("Removed first element is"); 
	               list.removeFirst();
	               break;       
			case 9:System.out.println("Enter the index");
			       index=sc.nextInt();
			       System.out.println(list.get(index));
			       break;
			case 10:System.out.println("Enter the position");
			        index=sc.nextInt();
		            sc.nextLine();
		            System.out.println("Enter the string element");
		            String ele=sc.nextLine();
		            list.set(index,ele);
		            break;
			case 11:System.out.println("List of elements are:"+list);  
			       break;
			case 12:System.out.println("Enter the element to be searched:");   
			       item=sc.nextLine();
			       if(list.contains(item))
			    	   System.out.println("Element found");
			       else
			    	   System.out.println("Element not found");
			       break;
			case 13:Collections.sort(list);
				   System.out.println("Sorted list is:"+list); 
				   break;
			case 14:return;
			}
		}
	}
}
public class Collectionsdemo 
{
     public static void main(String[] args) 
     {
    	 MyArrayList a=new MyArrayList();
    	 a.listOperations();
    	 MyLinkedList l=new MyLinkedList();
    	 l.LinkOperations();
     }
}
