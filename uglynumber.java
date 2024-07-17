import java.util.*;
public class uglynumber
{

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int d=0,r=1,j=0,i=1;
        int num = 0;
        int n=in.nextInt();
        int divisors[] ={2,3,5};
        while(j<n){
            num=i;
         for (int divisor : divisors)
         {
            while(num % divisor == 0) 
            {
                num = num/divisor;
            }
        }
        if(num==1)
        {
            j=j+1;
            if(j==n)
            System.out.println("THE "+n+"TH UGLY NUMBER---->"+i);
        }
        i=i+1;
        }
    }
}