package practise;

public class SubTest extends BaseTest{
	
	int c; // new instance variable of class Y
    public void m1(){
       // overriden method
       System.out.println("This is method m1 of class SubTest"+c);
   }
  public void m2(){
      super.m1();
      System.out.println("This is method m2 of class SubTest");
 }
  
}
