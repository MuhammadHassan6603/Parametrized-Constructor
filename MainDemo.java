class Box
{
	double width;
	double height;
	double depth;
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
}
  class MainDemo
{
     public static void main (String args [])
	{
	Box obj1 = new Box (1.0,2.0,3.0);
	Box obj2 = new Box (10.0,20.0,30.0);
	Box obj3 = new Box (100.0,200.0,300.0);
	System.out.println(obj1.width +"\n" + obj1.height +"\n"+ obj1.depth);
	System.out.println(obj2.width +"\n" + obj2.height +"\n"+ obj2.depth);
	System.out.println(obj3.width +"\n" + obj3.height +"\n"+ obj3.depth);
	}
}