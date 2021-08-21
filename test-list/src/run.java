// Just used to show my ability to created a linked list algorithm. 
public class run 
{
	public static void main(String[] args)
	{
		InventoryList<String> LinkedList = new InventoryList<String>();
		
		String Hello = "Hello";
		
		LinkedList.Add(Hello);
		LinkedList.Add("a");
		LinkedList.Add("b");
		LinkedList.Add("c");
		LinkedList.Add("d");
		LinkedList.Add("e");
		LinkedList.Add("f");
		LinkedList.Add("g");
		
		// Output the contents of the linked list.
		for(int i = 0; i < LinkedList.length(); i++)
		{
			System.out.println(LinkedList.Get(i));
		}
		
		System.out.println(LinkedList.Exists(Hello) + "");
	}
}
