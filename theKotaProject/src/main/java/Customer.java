import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
    private String name;
    private Dictionary<String, Integer> ingredients;
    private String sides;
    private String Status;

    public Customer(String name){
        this.name = name;
        this.ingredients = new Hashtable<String, Integer>();
        this.sides = "";
    }

    public String toString(){
        return  "";
    }

    public boolean handleKota(Kota kota){
       return kota.execute(this);
    }

    public Dictionary<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Dictionary<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
