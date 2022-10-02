import java.util.Scanner;

public class HelloWorld {

    private final String string;

    public HelloWorld(String string) {
        if (string.isEmpty()) this.string = "world";
        else this.string = string;
    }

    public String getName() {
        return this.string;
    }

    /**
     * Return a string that says hello to the user.
     *
     * @return String
     */
    public String sayHello(){
        return "Hello, " + getName().substring(0,1).toUpperCase()
                + getName().substring(1);
    }

    /**
     * If the string is null, return false. Otherwise, try to parse the string as a double. If it fails, return false.
     * Otherwise, return true
     *
     * @param stringNumber The string to be checked.
     * @return A boolean value.
     */
    public static boolean isNumeric(String stringNumber) {
        if (stringNumber == null) return false;
        try {
            double parseDouble = Double.parseDouble(stringNumber);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        while (true) {
            System.out.println("Replace the word 'World' in [Hello, World] with any word of your choice or press ENTER : ");
            try {
                word = scanner.nextLine();

                if (isNumeric(word)) throw new Exception();
                HelloWorld helloWorld = new HelloWorld(word);
                System.out.println(helloWorld.sayHello());
                break;

            } catch (Exception e){
                System.err.println("huh I cant understand numbers,"
                        + "ENTER A STRING !");
            }
        }
    }
}
