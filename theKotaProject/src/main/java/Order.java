import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to KotaMega!\nPlease enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("""
                        how can we satisfy your needs %s
                        
                        Select Kota :
                        1. DeluxeKota
                        2. RegularKota
                        3. VegetarianKota
                        
                        And enter preferred quantity :
                        (e.g) 1/1
                        """,
                name.substring(0, 1).toUpperCase() + name.substring(1));

        Customer customer = new Customer(name);
        boolean shouldContinue = true;

        do {
            String choice = scanner.nextLine();
            try {
                assert false;
                Kota order = Kota.createKota(choice);
                shouldContinue =  customer.handleKota(order);

            } catch (IllegalArgumentException e) {
                System.out.printf("Sorry, we do not provide kota number %s", choice.charAt(0));

            }
        } while (shouldContinue);


    }
}
