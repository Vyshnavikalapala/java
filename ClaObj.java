class Calculator{
    int a;
    public int add(int n1,int n2){
        System.out.println("Addition  :"+(n1+n2));
        return 0;
    }
}
class CalObj{
    public static void main(String aegs[]){
        Calculator obj=new Calculator(); // reference variable is obj because it is called by class
        int num1=10;
        int num2=20;
        obj.add(num1,num2);
    }
}