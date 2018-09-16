import java.util.Scanner;
abstract class animals
{
	String color;
	String breed;
	String name;
	
		abstract void eat();
		void speak()
		{
			System.out.println("coding is impossible");
			
			
		}
		
		
	}
	
	
	

class dog extends animals
{
	void eat()
	{
	System.out.println("kuch bhi");	
		
	}
	
	
}
class mainclass
{
	public static void main(String[] args)
	{
		dog obj=new dog();
		obj.speak();
		obj.eat();
		
		
	}
	
	
}