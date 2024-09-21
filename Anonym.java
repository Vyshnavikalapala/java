class A{
    public void show(){
        System.out.println("in A show");
    }
}
class Anonym{
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}