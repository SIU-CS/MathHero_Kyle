public class Multiplication extends Enemy
{
	public Multiplication()
	{
		super(.4);
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		solution = n1*n2;
		problem = n1+"*"+n2;
		radius = 8;
	}
}