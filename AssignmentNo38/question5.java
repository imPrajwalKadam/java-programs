/*
5. Write a recursive program which accept number from user and return its 
product of digits. 
Input : 523 
Output : 30 
*/

import java.util.Scanner;
public class question5 {
          static int iCnt = 1;
          static int iDigit = 0;
          static int iProd = 1;
          static int Display(int iNo)
          {
                    if(iNo > 0)
                    {
                      iDigit = iNo % 10;
                      iProd = iProd * iDigit;
                      iNo = iNo/10;
                      Display(iNo);
                    }
                    // while(iNo != 0)
                    // {
                    //   iDigit = iNo %10;
                    //   iSum = iSum + iDigit;
                    //   iNo = iNo/10;
                    // }
                    // System.out.print(iSum);  
                    return iProd;

          }
          public static void main (String arg[])
          {
                  Scanner sobj = new Scanner(System.in);
                  System.out.println("Enter number : ");
                  int iNo = sobj.nextInt();
                  int ret = 0;
                  ret = Display(iNo);
                  System.out.println("Product of digits is : "+ret);
          }
}
