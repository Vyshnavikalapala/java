abstract class A
{
    public abstract void show();
}
class AbstractAnonym{
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}