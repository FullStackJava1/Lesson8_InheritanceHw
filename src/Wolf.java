public class Wolf extends Dog
{
    String nameOfPack;
    public Wolf(String name,String favoriteDogFood ,String nameOfPack ){
        super(name,favoriteDogFood);
        this.nameOfPack=nameOfPack;
    }

    @Override
    public String toString() {
        return super.toString()+ " nameOfPack='" + nameOfPack + '\'';
    }
}
