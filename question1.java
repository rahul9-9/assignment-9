import java.util.Scanner;

interface animals
{
void speak();


void eat();
}

class cat implements animals{
public void speak()
{
System.out.println("meowww");

}
public void eat()
{

System.out.println("rats");

}


}
class dog implements animals{
public void speak()
{
System.out.println("barkkk");

}
public void eat()
{

System.out.println("anything");

}




}



class mainanimal
{

public static void main(String[] args)
{
cat obj1=new cat();
obj1.speak();
obj1.eat();
dog obj2=new dog();
obj2.speak();
obj2.eat();


}

}