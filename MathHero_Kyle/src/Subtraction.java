public class Subtraction extends Enemy
{
	public Subtraction()
	{
		super(.4);
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		solution = n1;
		problem = ""+(n1+n2)+"-"+n2;
		color = java.awt.Color.RED;
		radius = 5;
	}

	public String getProblem()
	{
		return problem;
	}

	public int getSolution()
	{
		return solution;
	}
}