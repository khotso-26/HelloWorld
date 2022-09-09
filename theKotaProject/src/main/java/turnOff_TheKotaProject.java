public class turnOff_TheKotaProject extends Kota{

    public turnOff_TheKotaProject(String instruction) {
        super(instruction,"0");
    }

    @Override
    public boolean execute(Customer kota) {
        System.out.printf("Thank you, %s.\nKotaMega hopes to see you again", kota.getName());
        return false;
    }
}
