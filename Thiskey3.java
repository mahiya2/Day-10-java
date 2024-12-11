import java.util.*;
public class Thiskey3{
    String name;
    Thiskey3(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
       Thiskey3 o=new Thiskey3("muskan");
       o.agt(); 
    }
}
class teacher{
    public void teach(Thiskey3 s)
    {
        s.dis1();
    }
}