public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


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


        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");

        var weightDifferent = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница между весами двух бойцов " + weightDifferent + " кг");

        var weightDifferent1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов " + weightDifferent1 + " кг");

        var weightDifferent2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами двух бойцов " + weightDifferent2 + " кг");

        var totalWorkHours = 640;
        var hoursEveryWorker = 8;
        var totalWorkers = totalWorkHours / hoursEveryWorker;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");

        var newTotalWorkers = totalWorkers + 94;
        var newHoursEveryWorker = totalWorkHours / newTotalWorkers;
        System.out.println("Если в компании работает " + newTotalWorkers + " человек, то всего " + newHoursEveryWorker + " часа работы может быть поделено между сотрудниками");

    }
}