//armstrong number
//example:153


import java.util.*;

class Digits
{
   boolean Armstrong(int iNo)
   {
	   int temp=iNo;
	   int iCnt=0,iDigit=0,iSum=0,iPower=0;
	   while(temp != 0)
	   {
		   temp = temp/10;
             iCnt++;
	   }
	   temp = iNo;
	   while(temp != 0)
	   {
		   iDigit = temp % 10;
		   for(int i=1;i<=iCnt;i++)
		   {
			   iPower = iPower*iDigit;
		   }
		   iSum = iSum + iPower;
		   iPower = 1;
		   temp = temp/10;
	   }

	   if(iSum==iNo)	
	   {
		   return true;
	   }
	   else{
		   return false;
	   } 
   }	
}



class program144	
{
	public static void main(String arg[])
	{
		int no;
		boolean bret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number:");
		no = sobj.nextInt();
		

		Digits dobj = new Digits();
		bret = dobj.Armstrong(no);
		if(bret == true)
		{
			System.out.println("It is armstrong  number");
		}
		else{
			System.out.println("It is not armstrong number");
		}
	}
}
