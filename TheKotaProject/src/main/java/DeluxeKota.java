import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class DeluxeKota extends Kota {

    private Dictionary<String, Integer> listOfIngredients;

    public DeluxeKota(String quantity) {
        super("non-vegetarian", quantity );
        this.listOfIngredients = new Hashtable<String, Integer>();
        this.listOfIngredients.put("White-bread", 1);
        this.listOfIngredients.put("Chips", 1);
    }

    @Override
    public boolean execute(Customer kota) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating deluxe kota");
        kota.setIngredients(this.listOfIngredients);
        boolean notDone = true;

        do {
            System.out.println("Add your ingredients: ");
            System.out.println( kota.getIngredients());
            String choice = scanner.nextLine();
            addIngredients(choice);

            if (choice.equalsIgnoreCase("done")) {
                return false;
            }

        } while (notDone);

        return true;
    }

    public Dictionary<String, Integer> getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(Dictionary<String, Integer> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public void addIngredients(String a){
        this.listOfIngredients.put(a, 1);
    }
}
