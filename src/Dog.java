public class Dog extends Animal
        {

    private  String favoriteDogFood;
    public Dog(String name,String favoriteDogFood){
        super(name);
        this.favoriteDogFood=favoriteDogFood;
    }
    public void Bark(){
        System.out.println("Bark fanction from Dog");

    }

            @Override
            public String toString() {
                return super.toString()+" the favoriteDogFood is: "+this.favoriteDogFood;
            }
        }
