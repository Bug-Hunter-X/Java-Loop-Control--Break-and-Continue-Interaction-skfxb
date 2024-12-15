public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) {
                break; // Exit the loop correctly
            }
            i++;
            //The continue statement should be outside the if condition for proper skip
            if (i == 8) {
                continue; // Skip to the next iteration
            }
            //This print statement will show the effect of continue statement
            System.out.println("continue statement works");
        }
    }
}