public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifferent = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов " + weightDifferent + " кг");

        // Задача 7
        System.out.println("Задача 7");
        var weightDifferent1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов (1 способ): " + weightDifferent1 + " кг");
        var weightDifferent2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов (2 способ): " + weightDifferent2 + " кг");

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkHours = 640;
        var hoursEveryWorker = 8;
        var totalWorkers = totalWorkHours / hoursEveryWorker;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");

         totalWorkers = totalWorkers + 94;
         totalWorkHours = hoursEveryWorker * totalWorkers;
        System.out.println(" Если в компании работает " + totalWorkers + " человек, то всего " + totalWorkHours + " часа работы может быть поделено между сотрудниками");

    }
}