class test {
    public static void main(String[] args)
    {
        sum(new int[]{10,20,30,40});      
    } 
    
    public static void sum(int[] is) 
    {
        int total=0;
       
        for(int x1:is)
        {
          total=total+x1;
        }
        
        System.out.println("the sum:" +total);
    }  
    
}
