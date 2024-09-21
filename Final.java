final class Calc{  /// final keyword used for the stop inheritance from one class to another class

    public  final void show(){  // final keyword also used to stop the method overriding
        System.out.println("by Vyshnavi...");

    }
    public int add (int a,int b){
        System.out.println(a+b);
        return a+b;
    }
}
class AdCalc extends Calc{
    public void show(){
        System.out.println("By Vyshu...");
    }
}
class Final{
    public static void main(String args[]){
        AdCalc obj=new AdCalc();
        obj.show();
        obj.add(3,4);
    }
}