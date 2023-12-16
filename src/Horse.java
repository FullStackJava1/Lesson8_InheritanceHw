public class Horse  extends Animal{
    Boolean racingHorse;
    public Horse(String name,boolean racingHorse){
        super(name);
        this.racingHorse=racingHorse;
    }
    public void Neigh(){
        System.out.println("Neigh fanction");
    }
    public String toString(){
        return super.toString()+" the Horse is racing Horse? "+this.racingHorse;
    }
}
