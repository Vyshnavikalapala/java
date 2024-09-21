abstract class  Car{  // abtraction is used to hide the implementation
    public abstract void drive();// abtract method 
    public void playMusic(){
        System.out.println("play music");
    }
}
class Wagon extends Car{
    public void drive(){
        System.out.println("Drive");
    }

}
class Abstract{
    public static void main(String args[]){
        Car obj=new Wangon();
        obj.drive();
     
        obj.playMusic();


        // we can'nt create a object to abstract class
    }


}