public class Poodle extends Dog{

    public String numOfPonyTails;
    public Poodle(String name ,String favoriteDogFood,String numOfPonyTails){
        super(name,favoriteDogFood);
        this.numOfPonyTails=numOfPonyTails;
    }
    @Override
    public void Bark() {
        //super.Bark();
        System.out.println("Bark fanction from Poodle");
    }
    public String toString(){
        return super.toString()+" the nuber of pony tails: "+this.numOfPonyTails;
    }
}
