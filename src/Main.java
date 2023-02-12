public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задачи 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 76378;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задачи 4-5");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3 () {
        System.out.println("Задачи 6-8");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Total weight of boxers is " + totalWeight + " kg");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Boxer's weight difference is " + weightDifference + " kg");
        System.out.println("Boxer's weight difference is " + weightDifference + " kg");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Boxer's weight difference calculated with remainder of dividing is " + weightDifference2 + " kg");
        var totalTime = 640;
        var workTime = 8;
        var workersNumber = totalTime / workTime;
        System.out.println("Total number of workers is " + workersNumber + " people");
        workersNumber = workersNumber + 94;
        workTime = totalTime / workersNumber;
        System.out.println("In the case of having 94 workers more, " + workTime + " work hours for each could be devided.");
    }
}