class Fibnosis{
    public static void main(String args[]){
        int a=0;
        int b=1;
        for(int i=2;i<=10;i++)
        {
            int c=a+b;
            System.out.println(i+"-->"+c);
            a=b;
            b=c;
        }
    }
}