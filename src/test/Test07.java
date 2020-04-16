package test;

public class Test07 {
	public static void main(String[] args)
    {
   	 int x=1,y=1;
   	 boolean a,b;
   	 a=((y=1)==0)&&((x=6)==6);
   	 System.out.println("x="+x);
   	 b=((y=1)==0)&((x=6)==6);
   	 System.out.println("x="+x);
   	 
    }
}
