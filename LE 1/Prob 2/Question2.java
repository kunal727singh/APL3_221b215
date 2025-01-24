
public class Question2 {
    public static void main(String[] args) {
        Mother m = new Mother(); 
        m.show();                

        Child ch = new Child();  
        ch.show();               

        Mother m2 = new Child(); 
        m2.show();               
    }
}