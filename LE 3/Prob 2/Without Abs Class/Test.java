class Test implements Testable {
    public void display() { 
        System.out.println("Display method from Test class.");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}