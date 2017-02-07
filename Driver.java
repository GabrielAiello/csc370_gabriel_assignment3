package hwassignment3csc300;

public class Driver 
{
	public static void main(String[] args)
	{
		Alist lst = new Alist();
		lst.add("s");
		lst.add("c");
		lst.add("v");
		lst.add("b");
		lst.add("g");
		lst.add("n");
		lst.display();
		lst.quickSort();
		lst.display();
	}
}
