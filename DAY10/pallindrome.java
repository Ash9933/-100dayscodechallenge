package d2009;

public class pallindrome {
    
    public static void main(String[] args) {
  
        int n=14581641, rev=0, rem, temp;
  
        temp = n;
  
        for( ;n != 0; n /= 10 )
        {
            rem = n % 10;
            rev= rev* 10 + rem;
        }
  
        if( temp== rev)
            System.out.println(temp + " PALLINDROME.");
        else
            System.out.println(temp + " NOT PALLINDROME.");
        }
    }

