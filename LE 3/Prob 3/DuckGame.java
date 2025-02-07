public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        System.out.println("=== Rubber Duck ===");
        rd.swim();
        ((Quackable) rd).quack();

        System.out.println("\n=== Wooden Duck ===");
        wd.swim();

        System.out.println("\n=== RedHead Duck ===");
        rhd.swim();
        ((Flyable) rhd).fly();
        ((Quackable) rhd).quack();

        System.out.println("\n=== Lake Duck ===");
        ld.swim();
        ((Flyable) ld).fly();
        ((Quackable) ld).quack();
    }
}
