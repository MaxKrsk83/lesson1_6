public class Main {
    public static void main(String[] args) {
        Animals [] animals = new Animals[10];
        animals[0] = new Dog("Бобик");
        animals[1] = new Dog("Тузик");
        animals[2] = new Dog("Шарик");
        animals[3] = new Dog("Бублик");
        animals[4] = new Cat("Барсик");
        animals[5] = new Cat("Мурзик");
        animals[6] = new Cat("Матроскин");
        animals[7] = new Cat("Просто кот");
        animals[8] = new Cat("Василий Иванович");
        animals[9] = new Cat("Наглая морда");

        for (Animals animal : animals) {
            animal.run(300);
            animal.swim(20);
        }
        System.out.printf("Всего участников %d из них:%n котов-%d%n собак-%d%n",animals.length,Cat.getCount(),Dog.getCount());
    }
}
