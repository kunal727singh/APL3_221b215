
public class Question1 {
    public static void main(String[] args) {
        Mother m = new Mother(); // Create object of Mother
        m.show();                // Call show() of Mother

        Child ch = new Child();  // Create object of Child
        ch.show();               // Call inherited show() from Mother
    }
}