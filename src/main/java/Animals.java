public class Animals {
    private final int swimmingRestrictions;
    private final int runningRestrictions;
    private final String name;

    public Animals(String name, int swimmingRestrictions, int runningRestrictions) {
        this.swimmingRestrictions = swimmingRestrictions;
        this.runningRestrictions = runningRestrictions;
        this.name = name;
    }

    public void run(int distance) {
        if (runningRestrictions> distance){
            System.out.printf("%s пробежал %d метров%n",name,distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров%n",name,distance);
        }
    }
    public void swim(int distance) {
        if (swimmingRestrictions> distance){
            System.out.printf("%s проплыл %d метров%n",name,distance);
        } else if (swimmingRestrictions==0){
            System.out.printf("%s не умеет плавать%n",name);
        }else {
            System.out.printf("%s не смог проплыть %d метров%n",name,distance);
        }
    }

}
