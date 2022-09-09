public class VegetarianKota extends Kota {

    public VegetarianKota(String quantity) {
        super("vegetarian", quantity);
    }

    @Override
    public boolean execute(Customer kota) {
        System.out.println("creating vegeterian kota");
        return true;
    }
}
