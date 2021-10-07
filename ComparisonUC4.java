package javapractice;
import java.util.Scanner;
class ComparisonCal
{
	 double dis;
 
	 ComparisonCal(int x1,int y1,int x2,int y2)
	 {
	  dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	 }
}


class ComparisonCal2
{

double dis2;

 ComparisonCal2(int z1,int y1,int z2,int y2)
 {
  dis2=(Math.sqrt((z2-z1)*(z2-z1) + (y2-y1)*(y2-y1)));
 }
}

class ComparisonUC4
{
	public static void main(String args[])
	
	{
           int x1,x2,y1,y2,z1,z2;
	
	   Scanner sc=new Scanner(System.in);
 
	   System.out.println("enter x1 point");
	   
           x1=sc.nextInt();
	  
           System.out.println("enter y1 point");
	   
           y1=sc.nextInt();
	 
           System.out.println("enter x2point");
	   
           x2=sc.nextInt();
	 
           System.out.println("enter y2 point");
	   
           y2=sc.nextInt();
		   
		   System.out.println("enter z1 point");
	   
           z1=sc.nextInt();
		   
		   System.out.println("enter z2 point");
	   
           z2=sc.nextInt();
	  
	   ComparisonCal cd=new ComparisonCal(x1,y1,x2,y2);	
	   ComparisonCal2 cd2=new ComparisonCal2(z1,y1,z2,y2);	   
 	 	    
  	      System.out.println("distancebetween Line 1:"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+cd.dis);
	      System.out.println("distancebetween Line 2:"+"("+z1+","+y1+"),"+"("+z2+","+y2+")===>"+cd2.dis2);
	      System.out.println("Comparing Two lines:"+(cd.equals(cd2)));
 
	
	}
}
