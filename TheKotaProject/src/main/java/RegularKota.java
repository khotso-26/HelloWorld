public class RegularKota extends Kota {

    public RegularKota(String quantity) {
        super("non-vegetarian", quantity);
    }

    @Override
    public boolean execute(Customer kota) {
        System.out.println("creating regular kota");
        return true;
    }
}
