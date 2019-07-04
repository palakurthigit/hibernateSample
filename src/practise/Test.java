package practise;

public class Test {
	
	 public static void main(String args[]){
	       BaseTest x= new BaseTest();
	       SubTest y = new  SubTest();
	       //y.m2();
	      //x.m1();
	      //y.m1();
	    // x = y;// parent pointing to object of child
	     
	     x.a=10;
	     y.c=x.a;
	     y.m1() ;
	   }

}
