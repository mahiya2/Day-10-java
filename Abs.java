import java.util.*;
  abstract  class mobileapp{
    abstract void menu();
     abstract void rating();
     abstract void contact();
}
class b extends mobileapp
{
      public void menu()
    {
        System.out.println("hello");
    }
      public void rating()
    {
        System.out.println("hello mahi");
    }
     public void contact()
    {
        System.out.println("879533498");
    }
}
public class Abs{
    public static void main(String args[]){
        b a=new b();
        a.contact();
        a.menu();
        a.rating();
    }
}