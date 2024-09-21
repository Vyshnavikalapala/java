/*class Upcasting{
    public static void main(String args[]){
        double d=4.5;
        int i=(int)d;
        System.out.println(i);
        System.out.println(d);
    }
}*/
class A{
    public void show(){
        System.out.print("in A show");
    }
}
class B extends A{
    public void show1(){
        System.out.print("in b show");
    }
}
public class upcasting{
    public static void main(String args[]){
        A obj=new B();
        obj.show();

        B obj1=(B)obj;
        obj1.show1();
    }
}