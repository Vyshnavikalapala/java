interface A{ 
    // we can't create object to a interface class
    //int age;// it shows error because 
    //variables are defaultly defined as final and static so we have to initialize it not only declaration
    int age=21;
    String name="vyshnavi";
    void show();
    void config();

}
class B implements A{// but we can create object to B
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class Interf{
    public static void main(String args[]){
        A obj=new B();
        obj.show();
        obj.config();
    }
}