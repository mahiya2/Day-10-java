import java.util.*;
 public class Constoverloading{
    String name;
    Constoverloading()
    {
        name="mahiya";
    }
    Constoverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[]){
        Constoverloading o=new Constoverloading();
        o.display();
        Constoverloading o1=new Constoverloading("fazz");
        o1.display();
    }
    }