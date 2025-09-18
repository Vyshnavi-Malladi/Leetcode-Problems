class Solution {

    private int sum(int x)
    {
          int sum=0;
          while(x>0)
          {
            int digit=x%10;
            sum+=digit;
            x/=10;
          }
        return sum;
    }
 
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int res=sum(x);
        if(x%res==0)
        {
            return res;
        }
        else
        {
            return -1;
        }
   
    }
}