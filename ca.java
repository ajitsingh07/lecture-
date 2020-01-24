import java.util.Scanner;
public class ca {
    public static void main(String args[])
    {
        int upper,lower,i,j,flag=0,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the start and end");
        upper=input.nextInt();
        lower=input.nextInt();
        for(i=upper;i<=lower;i++)
        {
            flag=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("the sum is:"+sum);
    }
}
