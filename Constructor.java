class a{
    int c;
    String b;
    a()
    {
        this.c=345;
        this.b="hello mahiya";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class Constructor{
    public static void main(String[] args) {
        a s=new a();
        s.display();
    }}
