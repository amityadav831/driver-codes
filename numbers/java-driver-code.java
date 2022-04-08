class Magic
{
  public static boolean magicNumber(int n)
  {
    int sum = 0;
    while(n>0 || sum>9)
    {
      if(n == 0)
      {
        n = sum;
        sum = 0;
      }
      return(sum == 1);
    }
    public static void main(String args[])
    {
      int n = 132;
      if(magicNumber(n))
        System.out.println("Magic Number");
      else
        System.out.println("Normal Number");
    }
  }
}
