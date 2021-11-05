public final class Cat extends Animals{
    private static int count=0;
    public static int getCount() {
        return count;
    }
    public Cat(String name) {
        super(name, 0, 200);
        count++;
    }
    @Override
    public void run(int distance) {
        System.out.print("Кот ");
        super.run(distance);
    }
    @Override
    public void swim(int distance) {
        System.out.print("Кот ");
        super.swim(distance);
    }

}
