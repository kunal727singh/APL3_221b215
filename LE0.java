class LE0 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Krishna krishna = new Krishna();
        krishna.setName("Krishna");
        krishna.setAge(21);
        System.out.println(krishna.getName());
        System.out.println(krishna.getAge());
    }
}