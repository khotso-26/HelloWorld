public abstract class Kota {

    private String kotaType;
    private String quantity;

    public Kota(String kotaType, String quantity) {
        this.kotaType = kotaType;
        this.quantity = quantity;

    }

    public String getKotaType() {
        return kotaType;
    }

    public void setKotaType(String kotaType) {
        this.kotaType = kotaType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public static Kota createKota(String Order){
        String[] args = Order.toLowerCase().trim().split("/");

        switch (args[0]) {
            case "shutdown":
            case "off":
                return new turnOff_TheKotaProject(args[0]);
            case "1":
                return new DeluxeKota(args[1]);
            case "2":
                return new RegularKota(args[1]);
            case "3":
                return new VegetarianKota(args[1]);
            default:
                throw new IllegalArgumentException("Kota is not supported: " + Order);
        }
    }

    public abstract boolean execute(Customer kota );

}
