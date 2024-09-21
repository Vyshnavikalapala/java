class Mobile{
    String Brand;// instace variables
    int price;
    static String name;
    public void show(){
        System.out.println(Brand+" "+price+" "+name+" ");
    }

}
public class StaticMethod{
    public static void main(String args[]){
        Mobile obj1=new Mobile();
        obj1.Brand="Apple";
        obj1.price=1000000;
        Mobile.name="Smartphone";

         Mobile obj2=new Mobile();
        obj2.Brand="Apple";
        obj2.price=1000000;
        Mobile.name="Smartphone";

        Mobile.name="Phone";

        obj1.show();
        obj2.show();
        //static variable are shared by different objects

    }
}