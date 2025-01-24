public class Question3 {
    public static void main(String[] args) {
        Mother m1 = new Mother();
        m1.show(); 

        Mother m2 = new Child();
        m2.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}