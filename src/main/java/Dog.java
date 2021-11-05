public class Dog extends Animals{
    private static int count=0;
    public static int getCount() {
        return count;
    }
    public Dog(String name) {
        super(name, 10, 500);
        count++;
    }
    @Override
    public void run(int distance) {
        System.out.print("Пес ");
        super.run(distance);
    }
    @Override
    public void swim(int distance) {
        System.out.print("Пес ");
        super.swim(distance);
    }
}
