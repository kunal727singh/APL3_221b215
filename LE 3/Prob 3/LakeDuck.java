class LakeDuck implements Duck, Flyable, Quackable {
    public void swim() {
        System.out.println("Lake Duck glides through the lake.");
    }

    public void fly() {
        System.out.println("Lake Duck flies gracefully.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks loudly.");
    }
}