package d2009;

public class multiples {
        static int find_sum(int N)
        {
            int sum = 0;
            for(int i = 0; i < N; i++)
                if(i%3 == 0 || i%5 == 0)
                    sum += i;
            return sum;                
        }
    
        public static void main (String[] args) 
        {
            int N = 15;
            int sum = find_sum(N);
            System.out.println(sum);
        }
    }  

