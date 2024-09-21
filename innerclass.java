class A{
    int  age;
    public void show(){
        System.out.println("A is in show");
    }
    class B{
        public  void config(){
            System.out.println("Inner class");
        }
    }
    
}
class innerclass{
    public static void main(String args[]){
        A obj=new A();
        obj.show();
        A.B onj1=obj.new B();
        onj1.config();
    }
}